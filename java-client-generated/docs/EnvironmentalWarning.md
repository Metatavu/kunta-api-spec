
# EnvironmentalWarning

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**type** | **String** | Possible values   - WEATHER   - FLOOD  |  [optional]
**context** | **String** | Possible values   - cold-weather   - forest-fire-weather   - grass-fire-weather   - hot-weather   - pedestrian-safety   - rain   - sea-icing   - sea-thunder-storm   - sea-water-height   - sea-wave-height   - sea-wind   - thunder-storm   - traffic-weather   - uv-note   - wind  |  [optional]
**description** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | Description of environmental warning |  [optional]
**causes** | **List&lt;String&gt;** |  |  [optional]
**actualizationProbability** | **Double** |  |  [optional]
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**end** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**severity** | **String** | Possible values   - level-1   - level-2   - level-3   - level-4  |  [optional]



