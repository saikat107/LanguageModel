<METHOD_START> @ Before public void void ( ) { this . org.springframework.core.convert.support.GenericConversionService . addConverter ( new CollectionToCollectionConverter ( this . org.springframework.core.convert.support.GenericConversionService ) ) ; this . org.springframework.core.convert.support.GenericConversionService . addConverter ( new ArrayToCollectionConverter ( this . org.springframework.core.convert.support.GenericConversionService ) ) ; this . org.springframework.core.convert.support.GenericConversionService . addConverter ( new CollectionToArrayConverter ( this . org.springframework.core.convert.support.GenericConversionService ) ) ; this . org.springframework.core.convert.support.GenericConversionService . addConverter ( this . org.springframework.core.convert.support.StreamConverter ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.NoSuchFieldException { this . org.springframework.core.convert.support.GenericConversionService . addConverter ( java.lang.Number .class , java.lang.String .class , new ObjectToStringConverter ( ) ) ; java.util.stream.Stream<java.lang.Integer> < java.lang.Integer > java.util.stream.Stream<java.lang.Integer> = java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) . java.util.stream.Stream<java.lang.Integer> ( ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( org.springframework.core.convert.support.StreamConverterTests.Types .class . java.lang.reflect.Field ( STRING ) ) ; ; java.lang.Object java.lang.Object = this . org.springframework.core.convert.support.GenericConversionService . convert ( java.util.stream.Stream<java.lang.Integer> , org.springframework.core.convert.support.TypeDescriptor ) ; assertNotNull ( STRING , java.lang.Object ) ; assertTrue ( STRING , java.lang.Object instanceof java.util.List ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = ( java.util.List<java.lang.String> < java.lang.String > ) java.lang.Object ; assertEquals ( STRING , java.util.List<java.lang.String> . java.lang.String ( NUMBER ) ) ; assertEquals ( STRING , java.util.List<java.lang.String> . java.lang.String ( NUMBER ) ) ; assertEquals ( STRING , java.util.List<java.lang.String> . java.lang.String ( NUMBER ) ) ; assertEquals ( STRING , NUMBER , java.util.List<java.lang.String> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.NoSuchFieldException { this . org.springframework.core.convert.support.GenericConversionService . addConverterFactory ( new NumberToNumberConverterFactory ( ) ) ; java.util.stream.Stream<java.lang.Integer> < java.lang.Integer > java.util.stream.Stream<java.lang.Integer> = java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) . java.util.stream.Stream<java.lang.Integer> ( ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( org.springframework.core.convert.support.StreamConverterTests.Types .class . java.lang.reflect.Field ( STRING ) ) ; ; java.lang.Object java.lang.Object = this . org.springframework.core.convert.support.GenericConversionService . convert ( java.util.stream.Stream<java.lang.Integer> , org.springframework.core.convert.support.TypeDescriptor ) ; assertNotNull ( STRING , java.lang.Object ) ; assertTrue ( STRING , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . boolean ( ) ) ; java.lang.Long [] java.lang.Long[] = ( java.lang.Long [] ) java.lang.Object ; assertEquals ( java.lang.Long . java.lang.Long ( NUMBER ) , java.lang.Long[] [ NUMBER ] ) ; assertEquals ( java.lang.Long . java.lang.Long ( NUMBER ) , java.lang.Long[] [ NUMBER ] ) ; assertEquals ( java.lang.Long . java.lang.Long ( NUMBER ) , java.lang.Long[] [ NUMBER ] ) ; assertEquals ( STRING , NUMBER , java.lang.Long[] . int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.NoSuchFieldException { java.util.stream.Stream<java.lang.Integer> < java.lang.Integer > java.util.stream.Stream<java.lang.Integer> = java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) . java.util.stream.Stream<java.lang.Integer> ( ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( org.springframework.core.convert.support.StreamConverterTests.Types .class . java.lang.reflect.Field ( STRING ) ) ; ; java.lang.Object java.lang.Object = this . org.springframework.core.convert.support.GenericConversionService . convert ( java.util.stream.Stream<java.lang.Integer> , org.springframework.core.convert.support.TypeDescriptor ) ; assertNotNull ( STRING , java.lang.Object ) ; assertTrue ( STRING , java.lang.Object instanceof java.util.List ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = ( java.util.List<java.lang.Object> < java.lang.Object > ) java.lang.Object ; assertEquals ( NUMBER , java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) ) ; assertEquals ( NUMBER , java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) ) ; assertEquals ( NUMBER , java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) ) ; assertEquals ( STRING , NUMBER , java.util.List<java.lang.Object> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.NoSuchFieldException { java.util.stream.Stream<java.lang.Integer> < java.lang.Integer > java.util.stream.Stream<java.lang.Integer> = java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) . java.util.stream.Stream<java.lang.Integer> ( ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( org.springframework.core.convert.support.StreamConverterTests.Types .class . java.lang.reflect.Field ( STRING ) ) ; ; org.springframework.core.convert.support.ExpectedException . expect ( ConversionFailedException .class ) ; org.springframework.core.convert.support.ExpectedException . expectCause ( is ( instanceOf ( ConverterNotFoundException .class ) ) ) ; this . org.springframework.core.convert.support.GenericConversionService . convert ( java.util.stream.Stream<java.lang.Integer> , org.springframework.core.convert.support.TypeDescriptor ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.NoSuchFieldException { this . org.springframework.core.convert.support.GenericConversionService . addConverterFactory ( new StringToNumberConverterFactory ( ) ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( org.springframework.core.convert.support.StreamConverterTests.Types .class . java.lang.reflect.Field ( STRING ) ) ; ; java.lang.Object java.lang.Object = this . org.springframework.core.convert.support.GenericConversionService . convert ( java.util.List<java.lang.String> , org.springframework.core.convert.support.TypeDescriptor ) ; assertNotNull ( STRING , java.lang.Object ) ; assertTrue ( STRING , java.lang.Object instanceof java.util.stream.Stream ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.stream.Stream<java.lang.Integer> < java.lang.Integer > java.util.stream.Stream<java.lang.Integer> = ( java.util.stream.Stream<java.lang.Integer> < java.lang.Integer > ) java.lang.Object ; assertEquals ( NUMBER , java.util.stream.Stream<java.lang.Integer> . java.util.stream.IntStream ( ( java.lang.Integer ) -> java.lang.Integer ) . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.NoSuchFieldException { java.lang.Integer [] java.lang.Integer[] = new java.lang.Integer [] { NUMBER , NUMBER , NUMBER } ; this . org.springframework.core.convert.support.GenericConversionService . addConverter ( new Converter < java.lang.Integer , java.lang.Boolean > ( ) { @ java.lang.Override public java.lang.Boolean java.lang.Boolean ( java.lang.Integer java.lang.Integer ) { return java.lang.Integer == NUMBER ; } } ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( org.springframework.core.convert.support.StreamConverterTests.Types .class . java.lang.reflect.Field ( STRING ) ) ; ; java.lang.Object java.lang.Object = this . org.springframework.core.convert.support.GenericConversionService . convert ( java.lang.Integer[] , org.springframework.core.convert.support.TypeDescriptor ) ; assertNotNull ( STRING , java.lang.Object ) ; assertTrue ( STRING , java.lang.Object instanceof java.util.stream.Stream ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.stream.Stream<java.lang.Boolean> < java.lang.Boolean > java.util.stream.Stream<java.lang.Boolean> = ( java.util.stream.Stream<java.lang.Boolean> < java.lang.Boolean > ) java.lang.Object ; assertEquals ( NUMBER , java.util.stream.Stream<java.lang.Boolean> . java.util.stream.Stream<java.lang.Boolean> ( java.lang.Boolean -> java.lang.Boolean ) . long ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Boolean java.lang.Boolean ( java.lang.Integer java.lang.Integer ) { return java.lang.Integer == NUMBER ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.NoSuchFieldException { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) ; TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = new TypeDescriptor ( org.springframework.core.convert.support.StreamConverterTests.Types .class . java.lang.reflect.Field ( STRING ) ) ; ; java.lang.Object java.lang.Object = this . org.springframework.core.convert.support.GenericConversionService . convert ( java.util.List<java.lang.String> , org.springframework.core.convert.support.TypeDescriptor ) ; assertNotNull ( STRING , java.lang.Object ) ; assertTrue ( STRING , java.lang.Object instanceof java.util.stream.Stream ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.stream.Stream<java.lang.Object> < java.lang.Object > java.util.stream.Stream<java.lang.Object> = ( java.util.stream.Stream<java.lang.Object> < java.lang.Object > ) java.lang.Object ; java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.util.stream.Stream<java.lang.Object> . void ( java.lang.StringBuilder :: java.lang.StringBuilder ) ; assertEquals ( STRING , java.lang.StringBuilder . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.NoSuchFieldException { assertFalse ( STRING , this . org.springframework.core.convert.support.StreamConverter . matches ( new TypeDescriptor ( org.springframework.core.convert.support.StreamConverterTests.Types .class . java.lang.reflect.Field ( STRING ) ) , new TypeDescriptor ( org.springframework.core.convert.support.StreamConverterTests.Types .class . java.lang.reflect.Field ( STRING ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.NoSuchFieldException { org.springframework.core.convert.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.core.convert.support.StreamConverter . convert ( new java.lang.Object ( ) , new TypeDescriptor ( org.springframework.core.convert.support.StreamConverterTests.Types .class . java.lang.reflect.Field ( STRING ) ) , new TypeDescriptor ( org.springframework.core.convert.support.StreamConverterTests.Types .class . java.lang.reflect.Field ( STRING ) ) ) ; }  <METHOD_END>