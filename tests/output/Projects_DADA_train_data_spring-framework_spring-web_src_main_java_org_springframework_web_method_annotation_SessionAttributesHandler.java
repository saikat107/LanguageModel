<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> , SessionAttributeStore org.springframework.web.method.annotation.SessionAttributeStore ) { Assert . notNull ( org.springframework.web.method.annotation.SessionAttributeStore , STRING ) ; this . org.springframework.web.method.annotation.SessionAttributeStore = org.springframework.web.method.annotation.SessionAttributeStore ; SessionAttributes org.springframework.web.method.annotation.SessionAttributes = AnnotatedElementUtils . findMergedAnnotation ( java.lang.Class<> , SessionAttributes .class ) ; if ( org.springframework.web.method.annotation.SessionAttributes != null ) { this . java.util.Set<java.lang.String> . boolean ( java.util.Arrays . java.util.List ( org.springframework.web.method.annotation.SessionAttributes . names ( ) ) ) ; this . java.util.Set<java.lang.Class<?>> . boolean ( java.util.Arrays . java.util.List ( org.springframework.web.method.annotation.SessionAttributes . types ( ) ) ) ; } for ( java.lang.String java.lang.String : this . java.util.Set<java.lang.String> ) { this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ( this . java.util.Set<java.lang.String> . int ( ) > NUMBER || this . java.util.Set<java.lang.Class<?>> . int ( ) > NUMBER ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.String , STRING ) ; if ( this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) || this . java.util.Set<java.lang.Class<?>> . boolean ( java.lang.Class<> ) ) { this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; return true ; } else { return false ; } }  <METHOD_END>
<METHOD_START> public void void ( WebRequest org.springframework.web.method.annotation.WebRequest , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { for ( java.lang.String java.lang.String : java.util.Map<java.lang.String,> . java.util.Set<java.lang.String> ( ) ) { java.lang.Object java.lang.Object = java.util.Map<java.lang.String,> . get ( java.lang.String ) ; java.lang.Class<?> < ? > java.lang.Class<?> = ( java.lang.Object != null ) ? java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) : null ; if ( boolean ( java.lang.String , java.lang.Class<> ) ) { this . org.springframework.web.method.annotation.SessionAttributeStore . storeAttribute ( org.springframework.web.method.annotation.WebRequest , java.lang.String , java.lang.Object ) ; } } }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( WebRequest org.springframework.web.method.annotation.WebRequest ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; for ( java.lang.String java.lang.String : this . java.util.Set<java.lang.String> ) { java.lang.Object java.lang.Object = this . org.springframework.web.method.annotation.SessionAttributeStore . retrieveAttribute ( org.springframework.web.method.annotation.WebRequest , java.lang.String ) ; if ( java.lang.Object != null ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; } } return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> public void void ( WebRequest org.springframework.web.method.annotation.WebRequest ) { for ( java.lang.String java.lang.String : this . java.util.Set<java.lang.String> ) { this . org.springframework.web.method.annotation.SessionAttributeStore . cleanupAttribute ( org.springframework.web.method.annotation.WebRequest , java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> java.lang.Object java.lang.Object ( WebRequest org.springframework.web.method.annotation.WebRequest , java.lang.String java.lang.String ) { return this . org.springframework.web.method.annotation.SessionAttributeStore . retrieveAttribute ( org.springframework.web.method.annotation.WebRequest , java.lang.String ) ; }  <METHOD_END>