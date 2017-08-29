<METHOD_START> @ Before public void void ( ) { MockitoAnnotations . initMocks ( this ) ; org.springframework.web.reactive.config.DelegatingWebFluxConfiguration = new DelegatingWebFluxConfiguration ( ) ; org.springframework.web.reactive.config.DelegatingWebFluxConfiguration . setApplicationContext ( new StaticApplicationContext ( ) ) ; given ( org.springframework.web.reactive.config.WebFluxConfigurer . getValidator ( ) ) . willReturn ( java.util.Optional . java.util.Optional<java.lang.Object> ( ) ) ; given ( org.springframework.web.reactive.config.WebFluxConfigurer . getMessageCodesResolver ( ) ) . willReturn ( java.util.Optional . java.util.Optional<java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.reactive.config.DelegatingWebFluxConfiguration . setConfigurers ( java.util.Collections . java.util.List ( org.springframework.web.reactive.config.WebFluxConfigurer ) ) ; org.springframework.web.reactive.config.DelegatingWebFluxConfiguration . requestMappingHandlerMapping ( ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . configureContentTypeResolver ( any ( RequestedContentTypeResolverBuilder .class ) ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . addCorsMappings ( any ( CorsRegistry .class ) ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . configurePathMatching ( any ( PathMatchConfigurer .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.reactive.config.DelegatingWebFluxConfiguration . setConfigurers ( java.util.Collections . java.util.List ( org.springframework.web.reactive.config.WebFluxConfigurer ) ) ; RequestMappingHandlerAdapter org.springframework.web.reactive.config.RequestMappingHandlerAdapter = org.springframework.web.reactive.config.DelegatingWebFluxConfiguration . requestMappingHandlerAdapter ( ) ; ConfigurableWebBindingInitializer org.springframework.web.reactive.config.ConfigurableWebBindingInitializer = ( ConfigurableWebBindingInitializer ) org.springframework.web.reactive.config.RequestMappingHandlerAdapter . getWebBindingInitializer ( ) ; ConversionService org.springframework.web.reactive.config.ConversionService = org.springframework.web.reactive.config.ConfigurableWebBindingInitializer . getConversionService ( ) ; assertTrue ( org.springframework.web.reactive.config.ConfigurableWebBindingInitializer . getValidator ( ) instanceof LocalValidatorFactoryBean ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . configureHttpMessageCodecs ( org.springframework.web.reactive.config.ArgumentCaptor<org.springframework.web.reactive.config.ServerCodecConfigurer> . capture ( ) ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . getValidator ( ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . getMessageCodesResolver ( ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . addFormatters ( org.springframework.web.reactive.config.ArgumentCaptor<org.springframework.web.reactive.config.FormatterRegistry> . capture ( ) ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . configureArgumentResolvers ( any ( ) ) ; assertSame ( org.springframework.web.reactive.config.ArgumentCaptor<org.springframework.web.reactive.config.FormatterRegistry> . getValue ( ) , org.springframework.web.reactive.config.ConversionService ) ; assertEquals ( NUMBER , org.springframework.web.reactive.config.ArgumentCaptor<org.springframework.web.reactive.config.ServerCodecConfigurer> . getValue ( ) . getReaders ( ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.reactive.config.DelegatingWebFluxConfiguration . setConfigurers ( java.util.Collections . java.util.List ( org.springframework.web.reactive.config.WebFluxConfigurer ) ) ; doAnswer ( invocation -> { ResourceHandlerRegistry registry = invocation . getArgument ( NUMBER ) ; registry . addResourceHandler ( STRING ) . addResourceLocations ( STRING ) ; return null ; } ) . when ( org.springframework.web.reactive.config.WebFluxConfigurer ) . addResourceHandlers ( any ( ResourceHandlerRegistry .class ) ) ; org.springframework.web.reactive.config.DelegatingWebFluxConfiguration . resourceHandlerMapping ( ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . addResourceHandlers ( any ( ResourceHandlerRegistry .class ) ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . configurePathMatching ( any ( PathMatchConfigurer .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.reactive.config.DelegatingWebFluxConfiguration . setConfigurers ( java.util.Collections . java.util.List ( org.springframework.web.reactive.config.WebFluxConfigurer ) ) ; org.springframework.web.reactive.config.DelegatingWebFluxConfiguration . responseBodyResultHandler ( ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . configureHttpMessageCodecs ( org.springframework.web.reactive.config.ArgumentCaptor<org.springframework.web.reactive.config.ServerCodecConfigurer> . capture ( ) ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . configureContentTypeResolver ( any ( RequestedContentTypeResolverBuilder .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.reactive.config.DelegatingWebFluxConfiguration . setConfigurers ( java.util.Collections . java.util.List ( org.springframework.web.reactive.config.WebFluxConfigurer ) ) ; org.springframework.web.reactive.config.DelegatingWebFluxConfiguration . viewResolutionResultHandler ( ) ; verify ( org.springframework.web.reactive.config.WebFluxConfigurer ) . configureViewResolvers ( any ( ViewResolverRegistry .class ) ) ; }  <METHOD_END>
