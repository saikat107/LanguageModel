<METHOD_START> public void ( ConversionService org.springframework.core.convert.support.ConversionService ) { this . org.springframework.core.convert.support.ConversionService = org.springframework.core.convert.support.ConversionService ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<org.springframework.core.convert.support.ConvertiblePair> < ConvertiblePair > java.util.Set<org.springframework.core.convert.support.ConvertiblePair> ( ) { return java.util.Collections . java.util.Set ( new ConvertiblePair ( java.util.Collection .class , java.lang.Object [] .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( TypeDescriptor org.springframework.core.convert.support.TypeDescriptor , TypeDescriptor org.springframework.core.convert.support.TypeDescriptor ) { return ConversionUtils . canConvertElements ( org.springframework.core.convert.support.TypeDescriptor . getElementTypeDescriptor ( ) , org.springframework.core.convert.support.TypeDescriptor . getElementTypeDescriptor ( ) , this . org.springframework.core.convert.support.ConversionService ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , TypeDescriptor org.springframework.core.convert.support.TypeDescriptor , TypeDescriptor org.springframework.core.convert.support.TypeDescriptor ) { if ( java.lang.Object == null ) { return null ; } java.util.Collection<?> < ? > java.util.Collection<?> = ( java.util.Collection<?> < ? > ) java.lang.Object ; java.lang.Object java.lang.Object = java.lang.reflect.Array . java.lang.Object ( org.springframework.core.convert.support.TypeDescriptor . getElementTypeDescriptor ( ) . getType ( ) , java.util.Collection<> . int ( ) ) ; int int = NUMBER ; for ( java.lang.Object java.lang.Object : java.util.Collection<> ) { java.lang.Object java.lang.Object = this . org.springframework.core.convert.support.ConversionService . convert ( java.lang.Object , org.springframework.core.convert.support.TypeDescriptor . elementTypeDescriptor ( java.lang.Object ) , org.springframework.core.convert.support.TypeDescriptor . getElementTypeDescriptor ( ) ) ; java.lang.reflect.Array . void ( java.lang.Object , int ++ , java.lang.Object ) ; } return java.lang.Object ; }  <METHOD_END>
