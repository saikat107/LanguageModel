<METHOD_START> @ Test public void void ( ) { @ java.lang.SuppressWarnings ( STRING ) DestinationResolver < java.lang.String > org.springframework.messaging.core.DestinationResolver<java.lang.String> = mock ( DestinationResolver .class ) ; CachingDestinationResolverProxy < java.lang.String > org.springframework.messaging.core.CachingDestinationResolverProxy<java.lang.String> = new CachingDestinationResolverProxy <> ( org.springframework.messaging.core.DestinationResolver<java.lang.String> ) ; given ( org.springframework.messaging.core.DestinationResolver<java.lang.String> . resolveDestination ( STRING ) ) . willReturn ( STRING ) ; given ( org.springframework.messaging.core.DestinationResolver<java.lang.String> . resolveDestination ( STRING ) ) . willReturn ( STRING ) ; assertEquals ( STRING , org.springframework.messaging.core.CachingDestinationResolverProxy<java.lang.String> . resolveDestination ( STRING ) ) ; assertEquals ( STRING , org.springframework.messaging.core.CachingDestinationResolverProxy<java.lang.String> . resolveDestination ( STRING ) ) ; assertEquals ( STRING , org.springframework.messaging.core.CachingDestinationResolverProxy<java.lang.String> . resolveDestination ( STRING ) ) ; assertEquals ( STRING , org.springframework.messaging.core.CachingDestinationResolverProxy<java.lang.String> . resolveDestination ( STRING ) ) ; verify ( org.springframework.messaging.core.DestinationResolver<java.lang.String> , times ( NUMBER ) ) . resolveDestination ( STRING ) ; verify ( org.springframework.messaging.core.DestinationResolver<java.lang.String> , times ( NUMBER ) ) . resolveDestination ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { CachingDestinationResolverProxy < java.lang.String > org.springframework.messaging.core.CachingDestinationResolverProxy<java.lang.String> = new CachingDestinationResolverProxy <> ( ) ; org.springframework.messaging.core.CachingDestinationResolverProxy<java.lang.String> . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new CachingDestinationResolverProxy < java.lang.String > ( null ) ; }  <METHOD_END>