<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; } catch ( java.lang.AssertionError java.lang.AssertionError ) { assertEquals ( STRING + STRING , java.lang.AssertionError . java.lang.String ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.client.UnorderedRequestExpectationManager . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.client.UnorderedRequestExpectationManager . expectRequest ( once ( ) , requestTo ( STRING ) ) . andExpect ( method ( GET ) ) . andRespond ( withSuccess ( ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . expectRequest ( once ( ) , requestTo ( STRING ) ) . andExpect ( method ( GET ) ) . andRespond ( withSuccess ( ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.client.UnorderedRequestExpectationManager . expectRequest ( twice ( ) , requestTo ( STRING ) ) . andExpect ( method ( GET ) ) . andRespond ( withSuccess ( ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . expectRequest ( twice ( ) , requestTo ( STRING ) ) . andExpect ( method ( GET ) ) . andRespond ( withSuccess ( ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.client.UnorderedRequestExpectationManager . expectRequest ( max ( NUMBER ) , requestTo ( STRING ) ) . andExpect ( method ( GET ) ) . andRespond ( withSuccess ( ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . expectRequest ( max ( NUMBER ) , requestTo ( STRING ) ) . andExpect ( method ( GET ) ) . andRespond ( withSuccess ( ) ) ; this . org.springframework.test.web.client.ExpectedException . expectMessage ( STRING + STRING + STRING + STRING + STRING + STRING ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.client.UnorderedRequestExpectationManager . expectRequest ( min ( NUMBER ) , requestTo ( STRING ) ) . andExpect ( method ( GET ) ) . andRespond ( withSuccess ( ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . expectRequest ( min ( NUMBER ) , requestTo ( STRING ) ) . andExpect ( method ( GET ) ) . andRespond ( withSuccess ( ) ) ; this . org.springframework.test.web.client.ExpectedException . expectMessage ( STRING + STRING + STRING + STRING ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . validateRequest ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; this . org.springframework.test.web.client.UnorderedRequestExpectationManager . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.test.web.client.ClientHttpRequest org.springframework.test.web.client.ClientHttpRequest ( HttpMethod org.springframework.test.web.client.HttpMethod , java.lang.String java.lang.String ) { try { return new org . springframework . org.springframework.mock . org.springframework.mock . org.springframework.mock . org.springframework.mock ( org.springframework.test.web.client.HttpMethod , new java.net.URI ( java.lang.String ) ) ; } catch ( java.net.URISyntaxException java.net.URISyntaxException ) { throw new java.lang.IllegalStateException ( java.net.URISyntaxException ) ; } }  <METHOD_END>