<METHOD_START> @ Before public void void ( ) { VersionResourceResolver org.springframework.web.reactive.resource.VersionResourceResolver = new VersionResourceResolver ( ) ; org.springframework.web.reactive.resource.VersionResourceResolver . setStrategyMap ( java.util.Collections . java.util.Map ( STRING , new ContentVersionStrategy ( ) ) ) ; PathResourceResolver org.springframework.web.reactive.resource.PathResourceResolver = new PathResourceResolver ( ) ; org.springframework.web.reactive.resource.PathResourceResolver . setAllowedLocations ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.reactive.resource.ResourceTransformerSupportTests> ( ) ) ) ; java.util.List<org.springframework.web.reactive.resource.ResourceResolver> < ResourceResolver > java.util.List<org.springframework.web.reactive.resource.ResourceResolver> = java.util.Arrays . java.util.List ( org.springframework.web.reactive.resource.VersionResourceResolver , org.springframework.web.reactive.resource.PathResourceResolver ) ; this . org.springframework.web.reactive.resource.ResourceTransformerChain = new DefaultResourceTransformerChain ( new DefaultResourceResolverChain ( java.util.List<org.springframework.web.reactive.resource.ResourceResolver> ) , null ) ; this . org.springframework.web.reactive.resource.ResourceTransformerSupportTests.TestResourceTransformerSupport = new org.springframework.web.reactive.resource.ResourceTransformerSupportTests.TestResourceTransformerSupport ( ) ; this . org.springframework.web.reactive.resource.ResourceTransformerSupportTests.TestResourceTransformerSupport . setResourceUrlProvider ( org.springframework.web.reactive.resource.ResourceUrlProvider ( java.util.List<org.springframework.web.reactive.resource.ResourceResolver> ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.resource.ResourceUrlProvider org.springframework.web.reactive.resource.ResourceUrlProvider ( java.util.List<org.springframework.web.reactive.resource.ResourceResolver> < ResourceResolver > java.util.List<org.springframework.web.reactive.resource.ResourceResolver> ) { ResourceWebHandler org.springframework.web.reactive.resource.ResourceWebHandler = new ResourceWebHandler ( ) ; org.springframework.web.reactive.resource.ResourceWebHandler . setLocations ( java.util.Collections . java.util.List ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.reactive.resource.ResourceTransformerSupportTests> ( ) ) ) ) ; org.springframework.web.reactive.resource.ResourceWebHandler . setResourceResolvers ( java.util.List<org.springframework.web.reactive.resource.ResourceResolver> ) ; ResourceUrlProvider org.springframework.web.reactive.resource.ResourceUrlProvider = new ResourceUrlProvider ( ) ; org.springframework.web.reactive.resource.ResourceUrlProvider . setHandlerMap ( java.util.Collections . java.util.Map ( STRING , org.springframework.web.reactive.resource.ResourceWebHandler ) ) ; return org.springframework.web.reactive.resource.ResourceUrlProvider ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockServerWebExchange org.springframework.web.reactive.resource.MockServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; java.lang.String java.lang.String = STRING ; Resource org.springframework.web.reactive.resource.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.reactive.resource.ResourceTransformerSupportTests> ( ) ) ; java.lang.String java.lang.String = this . org.springframework.web.reactive.resource.ResourceTransformerSupportTests.TestResourceTransformerSupport . resolveUrlPath ( java.lang.String , org.springframework.web.reactive.resource.MockServerWebExchange , org.springframework.web.reactive.resource.Resource , this . org.springframework.web.reactive.resource.ResourceTransformerChain ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( STRING , java.lang.String ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Resource org.springframework.web.reactive.resource.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.reactive.resource.ResourceTransformerSupportTests> ( ) ) ; MockServerWebExchange org.springframework.web.reactive.resource.MockServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; java.lang.String java.lang.String = this . org.springframework.web.reactive.resource.ResourceTransformerSupportTests.TestResourceTransformerSupport . resolveUrlPath ( STRING , org.springframework.web.reactive.resource.MockServerWebExchange , org.springframework.web.reactive.resource.Resource , this . org.springframework.web.reactive.resource.ResourceTransformerChain ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Resource org.springframework.web.reactive.resource.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.reactive.resource.ResourceTransformerSupportTests> ( ) ) ; MockServerWebExchange org.springframework.web.reactive.resource.MockServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; java.lang.String java.lang.String = this . org.springframework.web.reactive.resource.ResourceTransformerSupportTests.TestResourceTransformerSupport . resolveUrlPath ( STRING , org.springframework.web.reactive.resource.MockServerWebExchange , org.springframework.web.reactive.resource.Resource , this . org.springframework.web.reactive.resource.ResourceTransformerChain ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.resource.Mono<org.springframework.web.reactive.resource.Resource> < Resource > org.springframework.web.reactive.resource.Mono<org.springframework.web.reactive.resource.Resource> ( ServerWebExchange org.springframework.web.reactive.resource.ServerWebExchange , Resource org.springframework.web.reactive.resource.Resource , ResourceTransformerChain org.springframework.web.reactive.resource.ResourceTransformerChain ) { return Mono . error ( new java.lang.IllegalStateException ( STRING ) ) ; }  <METHOD_END>
