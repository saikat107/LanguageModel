<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { EventPublishingMethod . of ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { EventPublishingMethod . of ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.OneEvent .class ) . publishEventsFrom ( null , org.springframework.data.repository.core.support.ApplicationEventPublisher ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent = new org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ( ) ; org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent = new org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ( ) ; org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents = org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents . of ( java.util.Arrays . java.util.List<org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent> ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent , org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ) ) ; EventPublishingMethod . of ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents .class ) . publishEventsFrom ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents , org.springframework.data.repository.core.support.ApplicationEventPublisher ) ; verify ( org.springframework.data.repository.core.support.ApplicationEventPublisher ) . publishEvent ( eq ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ) ) ; verify ( org.springframework.data.repository.core.support.ApplicationEventPublisher ) . publishEvent ( eq ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent = new org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ( ) ; org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.OneEvent org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.OneEvent = org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.OneEvent . of ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ) ; EventPublishingMethod . of ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.OneEvent .class ) . publishEventsFrom ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.OneEvent , org.springframework.data.repository.core.support.ApplicationEventPublisher ) ; verify ( org.springframework.data.repository.core.support.ApplicationEventPublisher , times ( NUMBER ) ) . publishEvent ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.OneEvent org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.OneEvent = org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.OneEvent . of ( null ) ; EventPublishingMethod . of ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.OneEvent .class ) . publishEventsFrom ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.OneEvent , org.springframework.data.repository.core.support.ApplicationEventPublisher ) ; verify ( org.springframework.data.repository.core.support.ApplicationEventPublisher , times ( NUMBER ) ) . publishEvent ( any ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( EventPublishingMethod . of ( java.lang.Object .class ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { doReturn ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SampleRepository .class . java.lang.reflect.Method ( STRING , java.lang.Object .class ) ) . when ( org.springframework.data.repository.core.support.MethodInvocation ) . getMethod ( ) ; org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent = new org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ( ) ; org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents = org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents . of ( java.util.Collections . java.util.List<org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent> ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ) ) ; doReturn ( new java.lang.Object [] { org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents } ) . when ( org.springframework.data.repository.core.support.MethodInvocation ) . getArguments ( ) ; EventPublishingMethodInterceptor . of ( EventPublishingMethod . of ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents .class ) , org.springframework.data.repository.core.support.ApplicationEventPublisher ) . invoke ( org.springframework.data.repository.core.support.MethodInvocation ) ; verify ( org.springframework.data.repository.core.support.ApplicationEventPublisher ) . publishEvent ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { doReturn ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SampleRepository .class . java.lang.reflect.Method ( STRING , java.io.Serializable .class ) ) . when ( org.springframework.data.repository.core.support.MethodInvocation ) . getMethod ( ) ; EventPublishingMethodInterceptor . of ( EventPublishingMethod . of ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents .class ) , org.springframework.data.repository.core.support.ApplicationEventPublisher ) . invoke ( org.springframework.data.repository.core.support.MethodInvocation ) ; verify ( org.springframework.data.repository.core.support.ApplicationEventPublisher , never ( ) ) . publishEvent ( any ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RepositoryInformation org.springframework.data.repository.core.support.RepositoryInformation = new DummyRepositoryInformation ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SampleRepository .class ) ; RepositoryProxyPostProcessor org.springframework.data.repository.core.support.RepositoryProxyPostProcessor = new EventPublishingRepositoryProxyPostProcessor ( org.springframework.data.repository.core.support.ApplicationEventPublisher ) ; ProxyFactory org.springframework.data.repository.core.support.ProxyFactory = mock ( ProxyFactory .class ) ; org.springframework.data.repository.core.support.RepositoryProxyPostProcessor . postProcess ( org.springframework.data.repository.core.support.ProxyFactory , org.springframework.data.repository.core.support.RepositoryInformation ) ; verify ( org.springframework.data.repository.core.support.ProxyFactory ) . addAdvice ( any ( EventPublishingMethodInterceptor .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RepositoryInformation org.springframework.data.repository.core.support.RepositoryInformation = new DummyRepositoryInformation ( CrudRepository .class ) ; RepositoryProxyPostProcessor org.springframework.data.repository.core.support.RepositoryProxyPostProcessor = new EventPublishingRepositoryProxyPostProcessor ( org.springframework.data.repository.core.support.ApplicationEventPublisher ) ; ProxyFactory org.springframework.data.repository.core.support.ProxyFactory = mock ( ProxyFactory .class ) ; org.springframework.data.repository.core.support.RepositoryProxyPostProcessor . postProcess ( org.springframework.data.repository.core.support.ProxyFactory , org.springframework.data.repository.core.support.RepositoryInformation ) ; verify ( org.springframework.data.repository.core.support.ProxyFactory , never ( ) ) . addAdvice ( any ( Advice .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent = new org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ( ) ; org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents = org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents . of ( java.util.Collections . java.util.List<org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent> ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent ) ) ; doReturn ( new java.lang.Object [] { java.util.Collections . java.util.List<org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents> ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents ) } ) . when ( org.springframework.data.repository.core.support.MethodInvocation ) . getArguments ( ) ; doReturn ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SampleRepository .class . java.lang.reflect.Method ( STRING , java.lang.Iterable .class ) ) . when ( org.springframework.data.repository.core.support.MethodInvocation ) . getMethod ( ) ; EventPublishingMethodInterceptor . of ( EventPublishingMethod . of ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.MultipleEvents .class ) , org.springframework.data.repository.core.support.ApplicationEventPublisher ) . invoke ( org.springframework.data.repository.core.support.MethodInvocation ) ; verify ( org.springframework.data.repository.core.support.ApplicationEventPublisher ) . publishEvent ( any ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { doThrow ( new java.lang.IllegalStateException ( ) ) . when ( org.springframework.data.repository.core.support.MethodInvocation ) . proceed ( ) ; try { EventPublishingMethodInterceptor . of ( EventPublishingMethod . of ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.OneEvent .class ) , org.springframework.data.repository.core.support.ApplicationEventPublisher ) . invoke ( org.springframework.data.repository.core.support.MethodInvocation ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { verify ( org.springframework.data.repository.core.support.ApplicationEventPublisher , never ( ) ) . publishEvent ( any ( org.springframework.data.repository.core.support.EventPublishingRepositoryProxyPostProcessorUnitTests.SomeEvent .class ) ) ; } }  <METHOD_END>