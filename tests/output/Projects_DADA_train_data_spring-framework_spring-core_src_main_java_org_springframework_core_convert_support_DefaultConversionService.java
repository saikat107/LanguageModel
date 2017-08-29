<METHOD_START> public static org.springframework.core.convert.support.ConversionService org.springframework.core.convert.support.ConversionService ( ) { if ( org.springframework.core.convert.support.DefaultConversionService == null ) { synchronized ( org.springframework.core.convert.support.DefaultConversionService .class ) { if ( org.springframework.core.convert.support.DefaultConversionService == null ) { org.springframework.core.convert.support.DefaultConversionService = new org.springframework.core.convert.support.DefaultConversionService ( ) ; } } } return org.springframework.core.convert.support.DefaultConversionService ; }  <METHOD_END>
<METHOD_START> public void ( ) { void ( this ) ; }  <METHOD_END>
<METHOD_START> public static void void ( ConverterRegistry org.springframework.core.convert.support.ConverterRegistry ) { void ( org.springframework.core.convert.support.ConverterRegistry ) ; void ( org.springframework.core.convert.support.ConverterRegistry ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new ByteBufferConverter ( ( ConversionService ) org.springframework.core.convert.support.ConverterRegistry ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new StringToTimeZoneConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new ZoneIdToTimeZoneConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new ZonedDateTimeToCalendarConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new ObjectToObjectConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new IdToEntityConverter ( ( ConversionService ) org.springframework.core.convert.support.ConverterRegistry ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new FallbackObjectToStringConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new ObjectToOptionalConverter ( ( ConversionService ) org.springframework.core.convert.support.ConverterRegistry ) ) ; }  <METHOD_END>
<METHOD_START> public static void void ( ConverterRegistry org.springframework.core.convert.support.ConverterRegistry ) { ConversionService org.springframework.core.convert.support.ConversionService = ( ConversionService ) org.springframework.core.convert.support.ConverterRegistry ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new ArrayToCollectionConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new CollectionToArrayConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new ArrayToArrayConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new CollectionToCollectionConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new MapToMapConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new ArrayToStringConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new StringToArrayConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new ArrayToObjectConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new ObjectToArrayConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new CollectionToStringConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new StringToCollectionConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new CollectionToObjectConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new ObjectToCollectionConverter ( org.springframework.core.convert.support.ConversionService ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new StreamConverter ( org.springframework.core.convert.support.ConversionService ) ) ; }  <METHOD_END>
<METHOD_START> private static void void ( ConverterRegistry org.springframework.core.convert.support.ConverterRegistry ) { org.springframework.core.convert.support.ConverterRegistry . addConverterFactory ( new NumberToNumberConverterFactory ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverterFactory ( new StringToNumberConverterFactory ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( java.lang.Number .class , java.lang.String .class , new ObjectToStringConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new StringToCharacterConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( java.lang.Character .class , java.lang.String .class , new ObjectToStringConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new NumberToCharacterConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverterFactory ( new CharacterToNumberFactory ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new StringToBooleanConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( java.lang.Boolean .class , java.lang.String .class , new ObjectToStringConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverterFactory ( new StringToEnumConverterFactory ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new EnumToStringConverter ( ( ConversionService ) org.springframework.core.convert.support.ConverterRegistry ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverterFactory ( new IntegerToEnumConverterFactory ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new EnumToIntegerConverter ( ( ConversionService ) org.springframework.core.convert.support.ConverterRegistry ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new StringToLocaleConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( java.util.Locale .class , java.lang.String .class , new ObjectToStringConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new StringToCharsetConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( java.nio.charset.Charset .class , java.lang.String .class , new ObjectToStringConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new StringToCurrencyConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( java.util.Currency .class , java.lang.String .class , new ObjectToStringConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new StringToPropertiesConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new PropertiesToStringConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( new StringToUUIDConverter ( ) ) ; org.springframework.core.convert.support.ConverterRegistry . addConverter ( java.util.UUID .class , java.lang.String .class , new ObjectToStringConverter ( ) ) ; }  <METHOD_END>
