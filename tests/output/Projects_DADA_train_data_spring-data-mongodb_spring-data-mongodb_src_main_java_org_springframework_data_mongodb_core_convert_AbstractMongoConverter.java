<METHOD_START> public void ( GenericConversionService org.springframework.data.mongodb.core.convert.GenericConversionService ) { this . org.springframework.data.mongodb.core.convert.GenericConversionService = org.springframework.data.mongodb.core.convert.GenericConversionService == null ? new DefaultConversionService ( ) : org.springframework.data.mongodb.core.convert.GenericConversionService ; }  <METHOD_END>
<METHOD_START> public void void ( CustomConversions org.springframework.data.mongodb.core.convert.CustomConversions ) { this . org.springframework.data.mongodb.core.convert.CustomConversions = org.springframework.data.mongodb.core.convert.CustomConversions ; }  <METHOD_END>
<METHOD_START> public void void ( EntityInstantiators org.springframework.data.mongodb.core.convert.EntityInstantiators ) { this . org.springframework.data.mongodb.core.convert.EntityInstantiators = org.springframework.data.mongodb.core.convert.EntityInstantiators == null ? new EntityInstantiators ( ) : org.springframework.data.mongodb.core.convert.EntityInstantiators ; }  <METHOD_END>
<METHOD_START> private void void ( ) { org.springframework.data.mongodb.core.convert.GenericConversionService . addConverter ( ObjectIdToStringConverter . INSTANCE ) ; org.springframework.data.mongodb.core.convert.GenericConversionService . addConverter ( StringToObjectIdConverter . INSTANCE ) ; if ( ! org.springframework.data.mongodb.core.convert.GenericConversionService . canConvert ( ObjectId .class , java.math.BigInteger .class ) ) { org.springframework.data.mongodb.core.convert.GenericConversionService . addConverter ( ObjectIdToBigIntegerConverter . INSTANCE ) ; } if ( ! org.springframework.data.mongodb.core.convert.GenericConversionService . canConvert ( java.math.BigInteger .class , ObjectId .class ) ) { org.springframework.data.mongodb.core.convert.GenericConversionService . addConverter ( BigIntegerToObjectIdConverter . INSTANCE ) ; } org.springframework.data.mongodb.core.convert.CustomConversions . registerConvertersIn ( org.springframework.data.mongodb.core.convert.GenericConversionService ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { return java.lang.Object ( java.lang.Object , null ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.convert.ConversionService org.springframework.data.mongodb.core.convert.ConversionService ( ) { return org.springframework.data.mongodb.core.convert.GenericConversionService ; }  <METHOD_END>
<METHOD_START> public void void ( ) { void ( ) ; }  <METHOD_END>
