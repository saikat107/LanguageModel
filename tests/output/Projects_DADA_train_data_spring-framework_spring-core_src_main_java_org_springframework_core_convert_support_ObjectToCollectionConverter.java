<METHOD_START> public void ( ConversionService org.springframework.core.convert.support.ConversionService ) { this . org.springframework.core.convert.support.ConversionService = org.springframework.core.convert.support.ConversionService ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<org.springframework.core.convert.support.ConvertiblePair> < ConvertiblePair > java.util.Set<org.springframework.core.convert.support.ConvertiblePair> ( ) { return java.util.Collections . java.util.Set ( new ConvertiblePair ( java.lang.Object .class , java.util.Collection .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( TypeDescriptor org.springframework.core.convert.support.TypeDescriptor , TypeDescriptor org.springframework.core.convert.support.TypeDescriptor ) { return ConversionUtils . canConvertElements ( org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor . getElementTypeDescriptor ( ) , this . org.springframework.core.convert.support.ConversionService ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , TypeDescriptor org.springframework.core.convert.support.TypeDescriptor , TypeDescriptor org.springframework.core.convert.support.TypeDescriptor ) { if ( java.lang.Object == null ) { return null ; } TypeDescriptor org.springframework.core.convert.support.TypeDescriptor = org.springframework.core.convert.support.TypeDescriptor . getElementTypeDescriptor ( ) ; java.util.Collection<java.lang.Object> < java.lang.Object > java.util.Collection<java.lang.Object> = CollectionFactory . createCollection ( org.springframework.core.convert.support.TypeDescriptor . getType ( ) , ( org.springframework.core.convert.support.TypeDescriptor != null ? org.springframework.core.convert.support.TypeDescriptor . getType ( ) : null ) , NUMBER ) ; if ( org.springframework.core.convert.support.TypeDescriptor == null || org.springframework.core.convert.support.TypeDescriptor . isCollection ( ) ) { java.util.Collection<java.lang.Object> . boolean ( java.lang.Object ) ; } else { java.lang.Object java.lang.Object = this . org.springframework.core.convert.support.ConversionService . convert ( java.lang.Object , org.springframework.core.convert.support.TypeDescriptor , org.springframework.core.convert.support.TypeDescriptor ) ; java.util.Collection<java.lang.Object> . boolean ( java.lang.Object ) ; } return java.util.Collection<java.lang.Object> ; }  <METHOD_END>
