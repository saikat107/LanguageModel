<METHOD_START> public void void ( EntityManager org.springframework.integration.jpa.core.EntityManager ) { Assert . notNull ( org.springframework.integration.jpa.core.EntityManager , STRING ) ; this . org.springframework.integration.jpa.core.EntityManager = org.springframework.integration.jpa.core.EntityManager ; }  <METHOD_END>
<METHOD_START> public void void ( EntityManagerFactory org.springframework.integration.jpa.core.EntityManagerFactory ) { Assert . notNull ( org.springframework.integration.jpa.core.EntityManagerFactory , STRING ) ; this . org.springframework.integration.jpa.core.EntityManagerFactory = org.springframework.integration.jpa.core.EntityManagerFactory ; }  <METHOD_END>
<METHOD_START> public final void void ( ) { this . void ( ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { if ( this . org.springframework.integration.jpa.core.EntityManager == null && this . org.springframework.integration.jpa.core.EntityManagerFactory != null ) { this . org.springframework.integration.jpa.core.EntityManager = SharedEntityManagerCreator . createSharedEntityManager ( this . org.springframework.integration.jpa.core.EntityManagerFactory ) ; } Assert . notNull ( this . org.springframework.integration.jpa.core.EntityManager , STRING + STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.integration.jpa.core.EntityManager . flush ( ) ; }  <METHOD_END>
