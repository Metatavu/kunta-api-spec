/*global module:false*/

var fs = require('fs');

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  var PHP_CLIENT_VERSION = '0.0.2-alpha1';
  
  grunt.initConfig({
    'clean': {
      'jaxrs-spec-cruft': [
        'jaxrs-spec-generated/src/main/java/fi/otavanopisto/kuntaapi/server/RestApplication.java'
      ],
      'jaxrs-spec-sources': ['jaxrs-spec-generated/src'],
      'javascript-sources': ['javascript-generated/docs', 'javascript-generated/src', 'javascript-generated/test']
    },
    'copy': {
      'jaxrs-spec-extras': {
        src: '**',
        dest: 'jaxrs-spec-generated',
        cwd: 'jaxrs-spec-extras',
        expand: true
      }
    },
    'curl': {
      'swagger-codegen':  {
        src: 'http://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.2.1/swagger-codegen-cli-2.2.1.jar',
        dest: 'swagger-codegen-cli.jar'
      }
    },
    'shell': {
      'jaxrs-spec-generate': {
        command : 'mv jaxrs-spec-generated/pom.xml jaxrs-spec-generated/pom.xml.before && ' +
          'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l jaxrs-spec ' +
          '--api-package fi.otavanopisto.kuntaapi.server.rest ' +
          '--model-package fi.otavanopisto.kuntaapi.server.rest.model ' +
          '--group-id fi.otavanopisto.kunta-api ' +
          '--artifact-id kunta-api-spec ' +
          '--artifact-version `mvn -f jaxrs-spec-generated/pom.xml.before -q -Dexec.executable=\'echo\' -Dexec.args=\'${project.version}\' --non-recursive org.codehaus.mojo:exec-maven-plugin:1.3.1:exec` ' +
          '--template-dir jaxrs-spec-templates ' +
          '--additional-properties dateLibrary=java8 ' +
          '-o jaxrs-spec-generated/'
      },
      'jaxrs-spec-install': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'jaxrs-spec-generated'
          }
        }
      },
      'jaxrs-spec-release': {
        command : 'git add src pom.xml swagger.json && git commit -m "Generated source" && git push && mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'jaxrs-spec-generated'
          }
        }
      },
      'javascript-generate': {
        command : 'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l javascript ' +
          '--template-dir javascript-templates ' +
          '-o javascript-generated/ ' +
          '--additional-properties usePromises=true,projectName=kunta-api-client,projectVersion=' + require('./javascript-generated/package.json').version
      },
      'javascript-bump-version': {
        command: 'npm version patch',
        options: {
          execOptions: {
            cwd: 'javascript-generated'
          }
        }
      },
      'javascript-push': {
        command : 'git add . && git commit -m "Generated javascript source" && git push',
        options: {
          execOptions: {
            cwd: 'javascript-generated'
          }
        }
      },
      'php-client-generate': {
        command : 'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l php ' +
          '--template-dir php-templates ' +
          '-o php-generated ' +
          '--additional-properties packagePath=kunta-api-php-client,composerVendorName=otavanopisto,composerProjectName=kunta-api-php-client,variableNamingConvention=camelCase,invokerPackage=KuntaAPI,apiPackage=KuntaAPI\\\\Api,modelPackage=KuntaAPI\\\\Model,artifactVersion=' + PHP_CLIENT_VERSION
      },
      'php-client-publish': {
        command : 'sh git_push.sh',
        options: {
          execOptions: {
            cwd: 'php-generated/kunta-api-php-client'
          }
        }
      },
    },
    'publish': {
      'publish-javascript-client': {
        src: ['javascript-generated']
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('jaxrs-spec', ['download-dependencies', 'clean:jaxrs-spec-sources', 'shell:jaxrs-spec-generate', 'clean:jaxrs-spec-cruft', 'copy:jaxrs-spec-extras', 'shell:jaxrs-spec-install', 'shell:jaxrs-spec-release' ]);
  grunt.registerTask('javascript', ['download-dependencies', 'clean:javascript-sources', 'shell:javascript-generate', 'shell:javascript-bump-version', 'shell:javascript-push', 'publish:publish-javascript-client']);
  grunt.registerTask('php', ['shell:php-client-generate', 'shell:php-client-publish']);

  grunt.registerTask('default', ['jaxrs-spec', 'javascript', 'php']);
  
};