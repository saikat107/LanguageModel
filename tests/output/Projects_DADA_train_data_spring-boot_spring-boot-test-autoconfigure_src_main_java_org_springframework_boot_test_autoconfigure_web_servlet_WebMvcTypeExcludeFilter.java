<METHOD_START> void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this . org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest = AnnotatedElementUtils . getMergedAnnotation ( java.lang.Class<> , WebMvcTest .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return this . org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest != null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.test.autoconfigure.web.servlet.Filter [] org.springframework.boot.test.autoconfigure.web.servlet.Filter[] ( FilterType org.springframework.boot.test.autoconfigure.web.servlet.FilterType ) { switch ( org.springframework.boot.test.autoconfigure.web.servlet.FilterType ) { case INCLUDE : return this . org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest . includeFilters ( ) ; case EXCLUDE : return this . org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest . excludeFilters ( ) ; } throw new java.lang.IllegalStateException ( STRING + org.springframework.boot.test.autoconfigure.web.servlet.FilterType ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return this . org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest . useDefaultFilters ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Set<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Set<java.lang.Class<?>> ( ) { if ( ObjectUtils . isEmpty ( this . org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest . controllers ( ) ) ) { return java.util.Set<java.lang.Class<?>> ; } return java.util.Set<java.lang.Class<?>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Set<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Set<java.lang.Class<?>> ( ) { return new java.util.LinkedHashSet <> ( java.util.Arrays . java.util.List ( this . org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest . controllers ( ) ) ) ; }  <METHOD_END>