<METHOD_START> @ Before public void void ( ) { org.springframework.core.convert.support.GenericConversionService . addConverter ( new MapToMapConverter ( org.springframework.core.convert.support.GenericConversionService ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = TypeDescriptor . forObject ( java.util.Map<java.lang.String,java.lang.String> ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( java.lang.Class<? extends org.springframework.core.convert.support.MapToMapConverterTests> ( ) . java.lang.reflect.Field ( STRING ) ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ) ; try { org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.lang.String> , org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ; } catch ( ConversionFailedException org.springframework.core.convert.support.ConversionFailedException ) { assertTrue ( org.springframework.core.convert.support.ConversionFailedException . getCause ( ) instanceof ConverterNotFoundException ) ; } org.springframework.core.convert.support.GenericConversionService . addConverterFactory ( new StringToNumberConverterFactory ( ) ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.Map<java.lang.Integer,java.lang.Integer> < java.lang.Integer , java.lang.Integer > java.util.Map<java.lang.Integer,java.lang.Integer> = ( java.util.Map<java.lang.Integer,java.lang.Integer> < java.lang.Integer , java.lang.Integer > ) org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.lang.String> , org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ; assertFalse ( java.util.Map<java.lang.String,java.lang.String> . boolean ( java.util.Map<java.lang.Integer,java.lang.Integer> ) ) ; assertEquals ( ( java.lang.Integer ) NUMBER , java.util.Map<java.lang.Integer,java.lang.Integer> . java.lang.Integer ( NUMBER ) ) ; assertEquals ( ( java.lang.Integer ) NUMBER , java.util.Map<java.lang.Integer,java.lang.Integer> . java.lang.Integer ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( java.util.Map .class , java.util.Map .class ) ) ; assertSame ( java.util.Map<java.lang.String,java.lang.String> , org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.lang.String> , java.util.Map .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( java.lang.Class<? extends org.springframework.core.convert.support.MapToMapConverterTests> ( ) . java.lang.reflect.Field ( STRING ) ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( java.lang.Class<? extends org.springframework.core.convert.support.MapToMapConverterTests> ( ) . java.lang.reflect.Field ( STRING ) ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ) ; try { org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.lang.String> , org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ; } catch ( ConversionFailedException org.springframework.core.convert.support.ConversionFailedException ) { assertTrue ( org.springframework.core.convert.support.ConversionFailedException . getCause ( ) instanceof ConverterNotFoundException ) ; } org.springframework.core.convert.support.GenericConversionService . addConverterFactory ( new StringToNumberConverterFactory ( ) ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.Map<java.lang.Integer,java.lang.Integer> < java.lang.Integer , java.lang.Integer > java.util.Map<java.lang.Integer,java.lang.Integer> = ( java.util.Map<java.lang.Integer,java.lang.Integer> < java.lang.Integer , java.lang.Integer > ) org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.lang.String> , org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ; assertFalse ( java.util.Map<java.lang.String,java.lang.String> . boolean ( java.util.Map<java.lang.Integer,java.lang.Integer> ) ) ; assertEquals ( ( java.lang.Integer ) NUMBER , java.util.Map<java.lang.Integer,java.lang.Integer> . java.lang.Integer ( NUMBER ) ) ; assertEquals ( ( java.lang.Integer ) NUMBER , java.util.Map<java.lang.Integer,java.lang.Integer> . java.lang.Integer ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = new java.util.HashMap<java.lang.String,java.util.List<java.lang.String>> <> ( ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = TypeDescriptor . forObject ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( java.lang.Class<? extends org.springframework.core.convert.support.MapToMapConverterTests> ( ) . java.lang.reflect.Field ( STRING ) ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ) ; try { org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> , org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ; } catch ( ConversionFailedException org.springframework.core.convert.support.ConversionFailedException ) { assertTrue ( org.springframework.core.convert.support.ConversionFailedException . getCause ( ) instanceof ConverterNotFoundException ) ; } org.springframework.core.convert.support.GenericConversionService . addConverter ( new CollectionToCollectionConverter ( org.springframework.core.convert.support.GenericConversionService ) ) ; org.springframework.core.convert.support.GenericConversionService . addConverterFactory ( new StringToNumberConverterFactory ( ) ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> < java.lang.Integer , java.util.List<java.lang.Integer> < java.lang.Integer > > java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> = ( java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> < java.lang.Integer , java.util.List<java.lang.Integer> < java.lang.Integer > > ) org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> , org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ; assertFalse ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> . boolean ( java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> ) ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER ) , java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> . java.util.List<java.lang.Integer> ( NUMBER ) ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER ) , java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> . java.util.List<java.lang.Integer> ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = new java.util.HashMap<java.lang.String,java.util.List<java.lang.String>> <> ( ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( java.lang.Class<? extends org.springframework.core.convert.support.MapToMapConverterTests> ( ) . java.lang.reflect.Field ( STRING ) ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( java.lang.Class<? extends org.springframework.core.convert.support.MapToMapConverterTests> ( ) . java.lang.reflect.Field ( STRING ) ) ; assertFalse ( org.springframework.core.convert.support.GenericConversionService . canConvert ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ) ; try { org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> , org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ; fail ( STRING ) ; } catch ( ConverterNotFoundException org.springframework.core.convert.support.ConverterNotFoundException ) { } org.springframework.core.convert.support.GenericConversionService . addConverter ( new CollectionToCollectionConverter ( org.springframework.core.convert.support.GenericConversionService ) ) ; org.springframework.core.convert.support.GenericConversionService . addConverterFactory ( new StringToNumberConverterFactory ( ) ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> < java.lang.Integer , java.util.List<java.lang.Integer> < java.lang.Integer > > java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> = ( java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> < java.lang.Integer , java.util.List<java.lang.Integer> < java.lang.Integer > > ) org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> , org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ; assertFalse ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> . boolean ( java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> ) ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER ) , java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> . java.util.List<java.lang.Integer> ( NUMBER ) ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER ) , java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> . java.util.List<java.lang.Integer> ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = new java.util.HashMap<java.lang.String,java.util.List<java.lang.String>> <> ( ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( java.util.Map .class , java.util.Map .class ) ) ; assertSame ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> , org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> , java.util.Map .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = new java.util.HashMap<java.lang.String,java.util.List<java.lang.String>> <> ( ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; org.springframework.core.convert.support.GenericConversionService . addConverter ( new CollectionToCollectionConverter ( org.springframework.core.convert.support.GenericConversionService ) ) ; org.springframework.core.convert.support.GenericConversionService . addConverter ( new CollectionToObjectConverter ( org.springframework.core.convert.support.GenericConversionService ) ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( java.util.Map .class , java.util.Map .class ) ) ; assertSame ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> , org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> , java.util.Map .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = TypeDescriptor . forObject ( java.util.Map<java.lang.String,java.lang.String> ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( java.lang.Class<? extends org.springframework.core.convert.support.MapToMapConverterTests> ( ) . java.lang.reflect.Field ( STRING ) ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ) ; assertSame ( java.util.Map<java.lang.String,java.lang.String> , org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.lang.String> , org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( java.util.Map .class , java.util.Map .class ) ) ; assertSame ( java.util.Map<java.lang.String,java.lang.String> , org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.lang.String> , java.util.Map .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = TypeDescriptor . forObject ( java.util.Map<java.lang.String,java.lang.String> ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( java.lang.Class<? extends org.springframework.core.convert.support.MapToMapConverterTests> ( ) . java.lang.reflect.Field ( STRING ) ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.LinkedHashMap<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.LinkedHashMap<java.lang.String,java.lang.String> = ( java.util.LinkedHashMap<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > ) org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.lang.String> , org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ; assertEquals ( java.util.Map<java.lang.String,java.lang.String> , java.util.LinkedHashMap<java.lang.String,java.lang.String> ) ; assertEquals ( java.util.LinkedHashMap .class , java.util.LinkedHashMap<java.lang.String,java.lang.String> . java.lang.Class<? extends java.util.LinkedHashMap> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.core.convert.support.MapToMapConverterTests.NoDefaultConstructorMap<java.lang.String,java.lang.Integer> < java.lang.String , java.lang.Integer > org.springframework.core.convert.support.MapToMapConverterTests.NoDefaultConstructorMap<java.lang.String,java.lang.Integer> = new org.springframework.core.convert.support.MapToMapConverterTests.NoDefaultConstructorMap<java.lang.String,java.lang.Integer> <> ( java.util.Collections .< java.lang.String , java.lang.Integer > java.util.Map<java.lang.String,java.lang.Integer> ( STRING , NUMBER ) ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = TypeDescriptor . map ( org.springframework.core.convert.support.MapToMapConverterTests.NoDefaultConstructorMap .class , TypeDescriptor . valueOf ( java.lang.String .class ) , TypeDescriptor . valueOf ( java.lang.Integer .class ) ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = TypeDescriptor . map ( org.springframework.core.convert.support.MapToMapConverterTests.NoDefaultConstructorMap .class , TypeDescriptor . valueOf ( java.lang.String .class ) , TypeDescriptor . valueOf ( java.lang.Integer .class ) ) ; assertTrue ( org.springframework.core.convert.support.GenericConversionService . canConvert ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.Map<java.lang.String,java.lang.Integer> < java.lang.String , java.lang.Integer > java.util.Map<java.lang.String,java.lang.Integer> = ( java.util.Map<java.lang.String,java.lang.Integer> < java.lang.String , java.lang.Integer > ) org.springframework.core.convert.support.GenericConversionService . convert ( org.springframework.core.convert.support.MapToMapConverterTests.NoDefaultConstructorMap<java.lang.String,java.lang.Integer> , org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ; assertEquals ( org.springframework.core.convert.support.MapToMapConverterTests.NoDefaultConstructorMap<java.lang.String,java.lang.Integer> , java.util.Map<java.lang.String,java.lang.Integer> ) ; assertEquals ( org.springframework.core.convert.support.MapToMapConverterTests.NoDefaultConstructorMap .class , java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Class<? extends java.util.Map> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { DefaultConversionService . addDefaultConverters ( org.springframework.core.convert.support.GenericConversionService ) ; MultiValueMap < java.lang.String , java.lang.Integer > org.springframework.core.convert.support.MultiValueMap<java.lang.String,java.lang.Integer> = new LinkedMultiValueMap <> ( ) ; org.springframework.core.convert.support.MultiValueMap<java.lang.String,java.lang.Integer> . put ( STRING , java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) ) ; org.springframework.core.convert.support.MultiValueMap<java.lang.String,java.lang.Integer> . put ( STRING , java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( java.lang.Class<? extends org.springframework.core.convert.support.MapToMapConverterTests> ( ) . java.lang.reflect.Field ( STRING ) ) ; MultiValueMap < java.lang.String , java.lang.String > org.springframework.core.convert.support.MultiValueMap<java.lang.String,java.lang.String> = ( MultiValueMap < java.lang.String , java.lang.String > ) org.springframework.core.convert.support.GenericConversionService . convert ( org.springframework.core.convert.support.MultiValueMap<java.lang.String,java.lang.Integer> , org.springframework.core.convert.support.TypeDescriptor ) ; assertThat ( org.springframework.core.convert.support.MultiValueMap<java.lang.String,java.lang.String> . size ( ) , equalTo ( NUMBER ) ) ; assertThat ( org.springframework.core.convert.support.MultiValueMap<java.lang.String,java.lang.String> . get ( STRING ) , equalTo ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) ) ) ; assertThat ( org.springframework.core.convert.support.MultiValueMap<java.lang.String,java.lang.String> . get ( STRING ) , equalTo ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { DefaultConversionService . addDefaultConverters ( org.springframework.core.convert.support.GenericConversionService ) ; java.util.Map<java.lang.String,java.lang.Integer> < java.lang.String , java.lang.Integer > java.util.Map<java.lang.String,java.lang.Integer> = new java.util.HashMap<java.lang.String,java.lang.Integer> <> ( ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , NUMBER ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , NUMBER ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( java.lang.Class<? extends org.springframework.core.convert.support.MapToMapConverterTests> ( ) . java.lang.reflect.Field ( STRING ) ) ; MultiValueMap < java.lang.String , java.lang.String > org.springframework.core.convert.support.MultiValueMap<java.lang.String,java.lang.String> = ( MultiValueMap < java.lang.String , java.lang.String > ) org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.lang.Integer> , org.springframework.core.convert.support.TypeDescriptor ) ; assertThat ( org.springframework.core.convert.support.MultiValueMap<java.lang.String,java.lang.String> . size ( ) , equalTo ( NUMBER ) ) ; assertThat ( org.springframework.core.convert.support.MultiValueMap<java.lang.String,java.lang.String> . get ( STRING ) , equalTo ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ) ; assertThat ( org.springframework.core.convert.support.MultiValueMap<java.lang.String,java.lang.String> . get ( STRING ) , equalTo ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.core.convert.support.GenericConversionService . addConverterFactory ( new StringToEnumConverterFactory ( ) ) ; java.util.Map<java.lang.String,java.lang.Integer> < java.lang.String , java.lang.Integer > java.util.Map<java.lang.String,java.lang.Integer> = new java.util.HashMap<java.lang.String,java.lang.Integer> <> ( ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , NUMBER ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , NUMBER ) ; java.util.EnumMap<org.springframework.core.convert.support.MapToMapConverterTests.MyEnum,java.lang.Integer> < org.springframework.core.convert.support.MapToMapConverterTests.MyEnum , java.lang.Integer > java.util.EnumMap<org.springframework.core.convert.support.MapToMapConverterTests.MyEnum,java.lang.Integer> = new java.util.EnumMap<org.springframework.core.convert.support.MapToMapConverterTests.MyEnum,java.lang.Integer> <> ( org.springframework.core.convert.support.MapToMapConverterTests.MyEnum .class ) ; java.util.EnumMap<org.springframework.core.convert.support.MapToMapConverterTests.MyEnum,java.lang.Integer> . java.lang.Integer ( org.springframework.core.convert.support.MapToMapConverterTests.MyEnum . org.springframework.core.convert.support.MapToMapConverterTests.MyEnum , NUMBER ) ; java.util.EnumMap<org.springframework.core.convert.support.MapToMapConverterTests.MyEnum,java.lang.Integer> . java.lang.Integer ( org.springframework.core.convert.support.MapToMapConverterTests.MyEnum . org.springframework.core.convert.support.MapToMapConverterTests.MyEnum , NUMBER ) ; assertEquals ( java.util.EnumMap<org.springframework.core.convert.support.MapToMapConverterTests.MyEnum,java.lang.Integer> , org.springframework.core.convert.support.GenericConversionService . convert ( java.util.Map<java.lang.String,java.lang.Integer> , TypeDescriptor . forObject ( java.util.Map<java.lang.String,java.lang.Integer> ) , new TypeDescriptor ( java.lang.Class<? extends org.springframework.core.convert.support.MapToMapConverterTests> ( ) . java.lang.reflect.Field ( STRING ) ) ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.Map<? extends K,? extends V> < ? extends K , ? extends V > java.util.Map<? extends K,? extends V> ) { super( java.util.Map<,> ); }  <METHOD_END>