<METHOD_START> public static java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( PropertySources org.springframework.boot.bind.PropertySources , java.lang.String java.lang.String ) { return org.springframework.boot.bind.PropertySourceUtils . java.util.Map<java.lang.String,java.lang.Object> ( org.springframework.boot.bind.PropertySources , null , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( PropertySources org.springframework.boot.bind.PropertySources , java.lang.String java.lang.String , java.lang.String java.lang.String ) { RelaxedNames org.springframework.boot.bind.RelaxedNames = new RelaxedNames ( java.lang.String ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> <> ( ) ; for ( PropertySource < ? > org.springframework.boot.bind.PropertySource<?> : org.springframework.boot.bind.PropertySources ) { if ( org.springframework.boot.bind.PropertySource<> instanceof EnumerablePropertySource ) { for ( java.lang.String java.lang.String : ( ( EnumerablePropertySource < ? > ) org.springframework.boot.bind.PropertySource<> ) . getPropertyNames ( ) ) { java.lang.String java.lang.String = org.springframework.boot.bind.PropertySourceUtils . java.lang.String ( java.lang.String , java.lang.String , org.springframework.boot.bind.RelaxedNames ) ; if ( java.lang.String != null && ! java.util.Map<java.lang.String,java.lang.Object> . boolean ( java.lang.String ) ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , org.springframework.boot.bind.PropertySource<> . getProperty ( java.lang.String ) ) ; } } } } return java.util.Collections . java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String , RelaxedNames org.springframework.boot.bind.RelaxedNames ) { java.lang.String = ( java.lang.String == null ? STRING : java.lang.String ) ; for ( java.lang.String java.lang.String : new RelaxedNames ( java.lang.String ) ) { for ( java.lang.String java.lang.String : org.springframework.boot.bind.RelaxedNames ) { if ( java.lang.String . boolean ( java.lang.String + java.lang.String ) ) { return java.lang.String . java.lang.String ( ( java.lang.String + java.lang.String ) . int ( ) ) ; } } } return null ; }  <METHOD_END>
