<METHOD_START> @ Lazy @ Bean public org.springframework.data.web.config.QuerydslPredicateArgumentResolver org.springframework.data.web.config.QuerydslPredicateArgumentResolver ( ) { return new QuerydslPredicateArgumentResolver ( org.springframework.data.web.config.QuerydslBindingsFactory ( ) , java.util.Optional . java.util.Optional ( org.springframework.data.web.config.ObjectFactory<org.springframework.data.web.config.ConversionService> . getObject ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Lazy @ Bean public org.springframework.data.web.config.QuerydslBindingsFactory org.springframework.data.web.config.QuerydslBindingsFactory ( ) { return new QuerydslBindingsFactory ( SimpleEntityPathResolver . INSTANCE ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.util.List<org.springframework.data.web.config.HandlerMethodArgumentResolver> < HandlerMethodArgumentResolver > java.util.List<org.springframework.data.web.config.HandlerMethodArgumentResolver> ) { java.util.List<org.springframework.data.web.config.HandlerMethodArgumentResolver> . add ( NUMBER , org.springframework.data.web.config.QuerydslPredicateArgumentResolver ( ) ) ; }  <METHOD_END>
