<METHOD_START> public synchronized void void ( ApplicationContextEvent org.springframework.integration.config.ApplicationContextEvent ) { ApplicationContext org.springframework.integration.config.ApplicationContext = org.springframework.integration.config.ApplicationContextEvent . getApplicationContext ( ) ; if ( org.springframework.integration.config.ApplicationContextEvent instanceof ContextRefreshedEvent ) { boolean boolean = org.springframework.integration.config.ApplicationContext . getBeanNamesForType ( IdGenerator .class ) . length > NUMBER ; if ( boolean ) { if ( this . boolean ( org.springframework.integration.config.ApplicationContext ) ) { org.springframework.integration.config.IdGeneratorConfigurer . java.util.Set<java.lang.String> . boolean ( org.springframework.integration.config.ApplicationContext . getId ( ) ) ; } } } else if ( org.springframework.integration.config.ApplicationContextEvent instanceof ContextClosedEvent ) { if ( org.springframework.integration.config.IdGeneratorConfigurer . java.util.Set<java.lang.String> . boolean ( org.springframework.integration.config.ApplicationContext . getId ( ) ) ) { if ( org.springframework.integration.config.IdGeneratorConfigurer . java.util.Set<java.lang.String> . int ( ) == NUMBER ) { this . void ( ) ; } org.springframework.integration.config.IdGeneratorConfigurer . java.util.Set<java.lang.String> . boolean ( org.springframework.integration.config.ApplicationContext . getId ( ) ) ; } } }  <METHOD_END>
<METHOD_START> private boolean boolean ( ApplicationContext org.springframework.integration.config.ApplicationContext ) { try { IdGenerator org.springframework.integration.config.IdGenerator = org.springframework.integration.config.ApplicationContext . getBean ( IdGenerator .class ) ; if ( this . org.springframework.integration.config.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.config.Log . debug ( STRING + org.springframework.integration.config.IdGenerator . getClass ( ) + STRING ) ; } java.lang.reflect.Field java.lang.reflect.Field = ReflectionUtils . findField ( MessageHeaders .class , STRING ) ; ReflectionUtils . makeAccessible ( java.lang.reflect.Field ) ; IdGenerator org.springframework.integration.config.IdGenerator = ( IdGenerator ) ReflectionUtils . getField ( java.lang.reflect.Field , null ) ; if ( org.springframework.integration.config.IdGenerator != null ) { if ( org.springframework.integration.config.IdGenerator . equals ( org.springframework.integration.config.IdGenerator ) ) { return false ; } else { if ( org.springframework.integration.config.IdGeneratorConfigurer . org.springframework.integration.config.IdGenerator . getClass ( ) == org.springframework.integration.config.IdGenerator . getClass ( ) ) { if ( this . org.springframework.integration.config.Log . isWarnEnabled ( ) ) { this . org.springframework.integration.config.Log . warn ( STRING + org.springframework.integration.config.IdGenerator . getClass ( ) + STRING ) ; } return true ; } else { throw new BeanDefinitionStoreException ( STRING ) ; } } } if ( this . org.springframework.integration.config.Log . isInfoEnabled ( ) ) { this . org.springframework.integration.config.Log . info ( STRING + org.springframework.integration.config.IdGenerator . getClass ( ) + STRING ) ; } ReflectionUtils . setField ( java.lang.reflect.Field , null , org.springframework.integration.config.IdGenerator ) ; org.springframework.integration.config.IdGeneratorConfigurer . org.springframework.integration.config.IdGenerator = org.springframework.integration.config.IdGenerator ; } catch ( NoSuchBeanDefinitionException org.springframework.integration.config.NoSuchBeanDefinitionException ) { int int = org.springframework.integration.config.ApplicationContext . getBeansOfType ( IdGenerator .class ) . size ( ) ; if ( int > NUMBER && this . org.springframework.integration.config.Log . isWarnEnabled ( ) ) { this . org.springframework.integration.config.Log . warn ( STRING + int + STRING + STRING ) ; } else if ( this . org.springframework.integration.config.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.config.Log . debug ( STRING ) ; } return false ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { if ( this . org.springframework.integration.config.Log . isWarnEnabled ( ) ) { this . org.springframework.integration.config.Log . warn ( STRING + STRING , java.lang.IllegalStateException ) ; } return false ; } return true ; }  <METHOD_END>
<METHOD_START> private void void ( ) { try { java.lang.reflect.Field java.lang.reflect.Field = ReflectionUtils . findField ( MessageHeaders .class , STRING ) ; ReflectionUtils . makeAccessible ( java.lang.reflect.Field ) ; java.lang.reflect.Field . void ( null , null ) ; org.springframework.integration.config.IdGeneratorConfigurer . org.springframework.integration.config.IdGenerator = null ; } catch ( java.lang.Exception java.lang.Exception ) { if ( this . org.springframework.integration.config.Log . isWarnEnabled ( ) ) { this . org.springframework.integration.config.Log . warn ( STRING , java.lang.Exception ) ; } } }  <METHOD_END>
