<METHOD_START> @ Test ( expected = BeanDefinitionParsingException .class ) public void void ( ) java.lang.Exception { FailFastProblemReporter org.springframework.beans.factory.parsing.FailFastProblemReporter = new FailFastProblemReporter ( ) ; org.springframework.beans.factory.parsing.FailFastProblemReporter . error ( new Problem ( STRING , new Location ( new DescriptiveResource ( STRING ) ) , null , new java.lang.IllegalArgumentException ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Problem org.springframework.beans.factory.parsing.Problem = new Problem ( STRING , new Location ( new DescriptiveResource ( STRING ) ) , null , new java.lang.IllegalArgumentException ( ) ) ; Log org.springframework.beans.factory.parsing.Log = mock ( Log .class ) ; FailFastProblemReporter org.springframework.beans.factory.parsing.FailFastProblemReporter = new FailFastProblemReporter ( ) ; org.springframework.beans.factory.parsing.FailFastProblemReporter . setLogger ( org.springframework.beans.factory.parsing.Log ) ; org.springframework.beans.factory.parsing.FailFastProblemReporter . warning ( org.springframework.beans.factory.parsing.Problem ) ; verify ( org.springframework.beans.factory.parsing.Log ) . warn ( any ( ) , isA ( java.lang.IllegalArgumentException .class ) ) ; }  <METHOD_END>
