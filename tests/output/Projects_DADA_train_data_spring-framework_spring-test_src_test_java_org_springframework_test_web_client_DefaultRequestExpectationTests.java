<METHOD_START> @ Test public void void ( ) java.lang.Exception { RequestExpectation org.springframework.test.web.client.RequestExpectation = new DefaultRequestExpectation ( once ( ) , requestTo ( STRING ) ) ; org.springframework.test.web.client.RequestExpectation . match ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RequestExpectation org.springframework.test.web.client.RequestExpectation = new DefaultRequestExpectation ( once ( ) , requestTo ( STRING ) ) ; org.springframework.test.web.client.RequestExpectation . andExpect ( method ( POST ) ) ; this . org.springframework.test.web.client.ExpectedException . expectMessage ( STRING ) ; org.springframework.test.web.client.RequestExpectation . match ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RequestExpectation org.springframework.test.web.client.RequestExpectation = new DefaultRequestExpectation ( twice ( ) , requestTo ( STRING ) ) ; org.springframework.test.web.client.RequestExpectation . andRespond ( withSuccess ( ) ) ; org.springframework.test.web.client.RequestExpectation . createResponse ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; assertTrue ( org.springframework.test.web.client.RequestExpectation . hasRemainingCount ( ) ) ; org.springframework.test.web.client.RequestExpectation . createResponse ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; assertFalse ( org.springframework.test.web.client.RequestExpectation . hasRemainingCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RequestExpectation org.springframework.test.web.client.RequestExpectation = new DefaultRequestExpectation ( twice ( ) , requestTo ( STRING ) ) ; org.springframework.test.web.client.RequestExpectation . andRespond ( withSuccess ( ) ) ; org.springframework.test.web.client.RequestExpectation . createResponse ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; assertFalse ( org.springframework.test.web.client.RequestExpectation . isSatisfied ( ) ) ; org.springframework.test.web.client.RequestExpectation . createResponse ( org.springframework.test.web.client.ClientHttpRequest ( GET , STRING ) ) ; assertTrue ( org.springframework.test.web.client.RequestExpectation . isSatisfied ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.test.web.client.ClientHttpRequest org.springframework.test.web.client.ClientHttpRequest ( HttpMethod org.springframework.test.web.client.HttpMethod , java.lang.String java.lang.String ) { try { return new org . springframework . org.springframework.mock . org.springframework.mock . org.springframework.mock . org.springframework.mock ( org.springframework.test.web.client.HttpMethod , new java.net.URI ( java.lang.String ) ) ; } catch ( java.net.URISyntaxException java.net.URISyntaxException ) { throw new java.lang.IllegalStateException ( java.net.URISyntaxException ) ; } }  <METHOD_END>
