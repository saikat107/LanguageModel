<METHOD_START> void ( BeanManager org.springframework.data.jpa.repository.cdi.BeanManager , Bean < EntityManager > org.springframework.data.jpa.repository.cdi.Bean<org.springframework.data.jpa.repository.cdi.EntityManager> , java.util.Set<java.lang.annotation.Annotation> < java.lang.annotation.Annotation > java.util.Set<java.lang.annotation.Annotation> , java.lang.Class<T> < T > java.lang.Class<T> , java.util.Optional<org.springframework.data.jpa.repository.cdi.CustomRepositoryImplementationDetector> < CustomRepositoryImplementationDetector > java.util.Optional<org.springframework.data.jpa.repository.cdi.CustomRepositoryImplementationDetector> ) { super( java.util.Set<java.lang.annotation.Annotation> , java.lang.Class<T> , org.springframework.data.jpa.repository.cdi.BeanManager , java.util.Optional<org.springframework.data.jpa.repository.cdi.CustomRepositoryImplementationDetector> ); Assert . notNull ( org.springframework.data.jpa.repository.cdi.Bean<org.springframework.data.jpa.repository.cdi.EntityManager> , STRING ) ; this . org.springframework.data.jpa.repository.cdi.Bean<org.springframework.data.jpa.repository.cdi.EntityManager> = org.springframework.data.jpa.repository.cdi.Bean<org.springframework.data.jpa.repository.cdi.EntityManager> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public T T ( CreationalContext < T > org.springframework.data.jpa.repository.cdi.CreationalContext<T> , java.lang.Class<T> < T > java.lang.Class<T> , java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ) { EntityManager org.springframework.data.jpa.repository.cdi.EntityManager = getDependencyInstance ( org.springframework.data.jpa.repository.cdi.Bean<org.springframework.data.jpa.repository.cdi.EntityManager> , EntityManager .class ) ; JpaRepositoryFactory org.springframework.data.jpa.repository.cdi.JpaRepositoryFactory = new JpaRepositoryFactory ( org.springframework.data.jpa.repository.cdi.EntityManager ) ; return java.util.Optional<java.lang.Object> . boolean ( ) ? org.springframework.data.jpa.repository.cdi.JpaRepositoryFactory . getRepository ( java.lang.Class<T> , java.util.Optional<java.lang.Object> . java.lang.Object ( ) ) : org.springframework.data.jpa.repository.cdi.JpaRepositoryFactory . getRepository ( java.lang.Class<T> ) ; }  <METHOD_END>
