<METHOD_START> @ Before public void void ( ) { this . java.util.List<org.springframework.web.servlet.resource.Resource> = new java.util.ArrayList <> ( ) ; this . java.util.List<org.springframework.web.servlet.resource.Resource> . add ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.servlet.resource.VersionResourceResolverTests> ( ) ) ) ; this . java.util.List<org.springframework.web.servlet.resource.Resource> . add ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.servlet.resource.VersionResourceResolverTests> ( ) ) ) ; this . org.springframework.web.servlet.resource.VersionResourceResolver = new VersionResourceResolver ( ) ; this . org.springframework.web.servlet.resource.ResourceResolverChain = mock ( ResourceResolverChain .class ) ; this . org.springframework.web.servlet.resource.VersionStrategy = mock ( VersionStrategy .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; Resource org.springframework.web.servlet.resource.Resource = new ClassPathResource ( STRING + java.lang.String , java.lang.Class<? extends org.springframework.web.servlet.resource.VersionResourceResolverTests> ( ) ) ; given ( this . org.springframework.web.servlet.resource.ResourceResolverChain . resolveResource ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ) . willReturn ( org.springframework.web.servlet.resource.Resource ) ; this . org.springframework.web.servlet.resource.VersionResourceResolver . setStrategyMap ( java.util.Collections . java.util.Map ( STRING , this . org.springframework.web.servlet.resource.VersionStrategy ) ) ; Resource org.springframework.web.servlet.resource.Resource = this . org.springframework.web.servlet.resource.VersionResourceResolver . resolveResourceInternal ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> , this . org.springframework.web.servlet.resource.ResourceResolverChain ) ; assertEquals ( org.springframework.web.servlet.resource.Resource , org.springframework.web.servlet.resource.Resource ) ; verify ( this . org.springframework.web.servlet.resource.ResourceResolverChain , times ( NUMBER ) ) . resolveResource ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ; verify ( this . org.springframework.web.servlet.resource.VersionStrategy , never ( ) ) . extractVersion ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; given ( this . org.springframework.web.servlet.resource.ResourceResolverChain . resolveResource ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ) . willReturn ( null ) ; this . org.springframework.web.servlet.resource.VersionResourceResolver . setStrategyMap ( java.util.Collections . java.util.Map<java.lang.Object,java.lang.Object> ( ) ) ; Resource org.springframework.web.servlet.resource.Resource = this . org.springframework.web.servlet.resource.VersionResourceResolver . resolveResourceInternal ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> , this . org.springframework.web.servlet.resource.ResourceResolverChain ) ; assertNull ( org.springframework.web.servlet.resource.Resource ) ; verify ( this . org.springframework.web.servlet.resource.ResourceResolverChain , times ( NUMBER ) ) . resolveResource ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; given ( this . org.springframework.web.servlet.resource.ResourceResolverChain . resolveResource ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ) . willReturn ( null ) ; given ( this . org.springframework.web.servlet.resource.VersionStrategy . extractVersion ( java.lang.String ) ) . willReturn ( STRING ) ; this . org.springframework.web.servlet.resource.VersionResourceResolver . setStrategyMap ( java.util.Collections . java.util.Map ( STRING , this . org.springframework.web.servlet.resource.VersionStrategy ) ) ; Resource org.springframework.web.servlet.resource.Resource = this . org.springframework.web.servlet.resource.VersionResourceResolver . resolveResourceInternal ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> , this . org.springframework.web.servlet.resource.ResourceResolverChain ) ; assertNull ( org.springframework.web.servlet.resource.Resource ) ; verify ( this . org.springframework.web.servlet.resource.ResourceResolverChain , times ( NUMBER ) ) . resolveResource ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ; verify ( this . org.springframework.web.servlet.resource.VersionStrategy , times ( NUMBER ) ) . extractVersion ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; given ( this . org.springframework.web.servlet.resource.ResourceResolverChain . resolveResource ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ) . willReturn ( null ) ; given ( this . org.springframework.web.servlet.resource.ResourceResolverChain . resolveResource ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ) . willReturn ( null ) ; given ( this . org.springframework.web.servlet.resource.VersionStrategy . extractVersion ( java.lang.String ) ) . willReturn ( java.lang.String ) ; given ( this . org.springframework.web.servlet.resource.VersionStrategy . removeVersion ( java.lang.String , java.lang.String ) ) . willReturn ( java.lang.String ) ; this . org.springframework.web.servlet.resource.VersionResourceResolver . setStrategyMap ( java.util.Collections . java.util.Map ( STRING , this . org.springframework.web.servlet.resource.VersionStrategy ) ) ; Resource org.springframework.web.servlet.resource.Resource = this . org.springframework.web.servlet.resource.VersionResourceResolver . resolveResourceInternal ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> , this . org.springframework.web.servlet.resource.ResourceResolverChain ) ; assertNull ( org.springframework.web.servlet.resource.Resource ) ; verify ( this . org.springframework.web.servlet.resource.VersionStrategy , times ( NUMBER ) ) . removeVersion ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; Resource org.springframework.web.servlet.resource.Resource = new ClassPathResource ( STRING + java.lang.String , java.lang.Class<? extends org.springframework.web.servlet.resource.VersionResourceResolverTests> ( ) ) ; given ( this . org.springframework.web.servlet.resource.ResourceResolverChain . resolveResource ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ) . willReturn ( null ) ; given ( this . org.springframework.web.servlet.resource.ResourceResolverChain . resolveResource ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ) . willReturn ( org.springframework.web.servlet.resource.Resource ) ; given ( this . org.springframework.web.servlet.resource.VersionStrategy . extractVersion ( java.lang.String ) ) . willReturn ( java.lang.String ) ; given ( this . org.springframework.web.servlet.resource.VersionStrategy . removeVersion ( java.lang.String , java.lang.String ) ) . willReturn ( java.lang.String ) ; given ( this . org.springframework.web.servlet.resource.VersionStrategy . getResourceVersion ( org.springframework.web.servlet.resource.Resource ) ) . willReturn ( STRING ) ; this . org.springframework.web.servlet.resource.VersionResourceResolver . setStrategyMap ( java.util.Collections . java.util.Map ( STRING , this . org.springframework.web.servlet.resource.VersionStrategy ) ) ; Resource org.springframework.web.servlet.resource.Resource = this . org.springframework.web.servlet.resource.VersionResourceResolver . resolveResourceInternal ( null , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> , this . org.springframework.web.servlet.resource.ResourceResolverChain ) ; assertNull ( org.springframework.web.servlet.resource.Resource ) ; verify ( this . org.springframework.web.servlet.resource.VersionStrategy , times ( NUMBER ) ) . getResourceVersion ( org.springframework.web.servlet.resource.Resource ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; Resource org.springframework.web.servlet.resource.Resource = new ClassPathResource ( STRING + java.lang.String , java.lang.Class<? extends org.springframework.web.servlet.resource.VersionResourceResolverTests> ( ) ) ; MockHttpServletRequest org.springframework.web.servlet.resource.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; given ( this . org.springframework.web.servlet.resource.ResourceResolverChain . resolveResource ( org.springframework.web.servlet.resource.MockHttpServletRequest , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ) . willReturn ( null ) ; given ( this . org.springframework.web.servlet.resource.ResourceResolverChain . resolveResource ( org.springframework.web.servlet.resource.MockHttpServletRequest , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ) . willReturn ( org.springframework.web.servlet.resource.Resource ) ; given ( this . org.springframework.web.servlet.resource.VersionStrategy . extractVersion ( java.lang.String ) ) . willReturn ( java.lang.String ) ; given ( this . org.springframework.web.servlet.resource.VersionStrategy . removeVersion ( java.lang.String , java.lang.String ) ) . willReturn ( java.lang.String ) ; given ( this . org.springframework.web.servlet.resource.VersionStrategy . getResourceVersion ( org.springframework.web.servlet.resource.Resource ) ) . willReturn ( java.lang.String ) ; this . org.springframework.web.servlet.resource.VersionResourceResolver . setStrategyMap ( java.util.Collections . java.util.Map ( STRING , this . org.springframework.web.servlet.resource.VersionStrategy ) ) ; Resource org.springframework.web.servlet.resource.Resource = this . org.springframework.web.servlet.resource.VersionResourceResolver . resolveResourceInternal ( org.springframework.web.servlet.resource.MockHttpServletRequest , java.lang.String , this . java.util.List<org.springframework.web.servlet.resource.Resource> , this . org.springframework.web.servlet.resource.ResourceResolverChain ) ; assertEquals ( org.springframework.web.servlet.resource.Resource . getFilename ( ) , org.springframework.web.servlet.resource.Resource . getFilename ( ) ) ; verify ( this . org.springframework.web.servlet.resource.VersionStrategy , times ( NUMBER ) ) . getResourceVersion ( org.springframework.web.servlet.resource.Resource ) ; assertThat ( org.springframework.web.servlet.resource.Resource , instanceOf ( HttpResource .class ) ) ; assertEquals ( STRING + java.lang.String + STRING , ( ( HttpResource ) org.springframework.web.servlet.resource.Resource ) . getResponseHeaders ( ) . getETag ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,org.springframework.web.servlet.resource.VersionStrategy> < java.lang.String , VersionStrategy > java.util.Map<java.lang.String,org.springframework.web.servlet.resource.VersionStrategy> = new java.util.HashMap<java.lang.String,org.springframework.web.servlet.resource.VersionStrategy> <> ( ) ; VersionStrategy org.springframework.web.servlet.resource.VersionStrategy = mock ( VersionStrategy .class ) ; VersionStrategy org.springframework.web.servlet.resource.VersionStrategy = mock ( VersionStrategy .class ) ; java.util.Map<java.lang.String,org.springframework.web.servlet.resource.VersionStrategy> . put ( STRING , org.springframework.web.servlet.resource.VersionStrategy ) ; java.util.Map<java.lang.String,org.springframework.web.servlet.resource.VersionStrategy> . put ( STRING STRING , org.springframework.web.servlet.resource.VersionStrategy ) ; this . org.springframework.web.servlet.resource.VersionResourceResolver . setStrategyMap ( java.util.Map<java.lang.String,org.springframework.web.servlet.resource.VersionStrategy> ) ; assertEquals ( org.springframework.web.servlet.resource.VersionStrategy , this . org.springframework.web.servlet.resource.VersionResourceResolver . getStrategyForPath ( STRING ) ) ; assertEquals ( org.springframework.web.servlet.resource.VersionStrategy , this . org.springframework.web.servlet.resource.VersionResourceResolver . getStrategyForPath ( STRING ) ) ; assertEquals ( org.springframework.web.servlet.resource.VersionStrategy , this . org.springframework.web.servlet.resource.VersionResourceResolver . getStrategyForPath ( STRING ) ) ; assertEquals ( org.springframework.web.servlet.resource.VersionStrategy , this . org.springframework.web.servlet.resource.VersionResourceResolver . getStrategyForPath ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.resource.VersionResourceResolver . addFixedVersionStrategy ( STRING , STRING , STRING , STRING ) ; assertThat ( this . org.springframework.web.servlet.resource.VersionResourceResolver . getStrategyMap ( ) . size ( ) , is ( NUMBER ) ) ; assertThat ( this . org.springframework.web.servlet.resource.VersionResourceResolver . getStrategyForPath ( STRING ) , Matchers . instanceOf ( FixedVersionStrategy .class ) ) ; assertThat ( this . org.springframework.web.servlet.resource.VersionResourceResolver . getStrategyForPath ( STRING ) , Matchers . instanceOf ( FixedVersionStrategy .class ) ) ; assertThat ( this . org.springframework.web.servlet.resource.VersionResourceResolver . getStrategyForPath ( STRING ) , Matchers . instanceOf ( FixedVersionStrategy .class ) ) ; assertThat ( this . org.springframework.web.servlet.resource.VersionResourceResolver . getStrategyForPath ( STRING ) , Matchers . instanceOf ( FixedVersionStrategy .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . org.springframework.web.servlet.resource.ResourceResolverChain . resolveUrlPath ( STRING , this . java.util.List<org.springframework.web.servlet.resource.Resource> ) ) . willReturn ( STRING ) ; java.lang.String java.lang.String = this . org.springframework.web.servlet.resource.VersionResourceResolver . resolveUrlPathInternal ( STRING , this . java.util.List<org.springframework.web.servlet.resource.Resource> , this . org.springframework.web.servlet.resource.ResourceResolverChain ) ; assertThat ( java.lang.String , is ( STRING ) ) ; }  <METHOD_END>
