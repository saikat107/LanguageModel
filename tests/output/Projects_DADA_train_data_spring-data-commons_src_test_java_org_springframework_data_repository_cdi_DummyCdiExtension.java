<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) void void ( @ Observes AfterBeanDiscovery org.springframework.data.repository.cdi.AfterBeanDiscovery , BeanManager org.springframework.data.repository.cdi.BeanManager ) { org.springframework.data.repository.cdi.AfterBeanDiscovery . addContext ( new org.springframework.data.repository.cdi.DummyCdiExtension.MyCustomScope ( ) ) ; for ( java.util.Map.Entry<java.lang.Class<?>,java.util.Set<java.lang.annotation.Annotation>> < java.lang.Class<?> < ? > , java.util.Set<java.lang.annotation.Annotation> < java.lang.annotation.Annotation > > java.util.Map.Entry<java.lang.Class<?>,java.util.Set<java.lang.annotation.Annotation>> : getRepositoryTypes ( ) ) { org.springframework.data.repository.cdi.DummyCdiExtension.DummyCdiRepositoryBean org.springframework.data.repository.cdi.DummyCdiExtension.DummyCdiRepositoryBean = new org.springframework.data.repository.cdi.DummyCdiExtension.DummyCdiRepositoryBean ( java.util.Map.Entry<java.lang.Class<?>,java.util.Set<java.lang.annotation.Annotation>> . java.util.Set<java.lang.annotation.Annotation> ( ) , java.util.Map.Entry<java.lang.Class<?>,java.util.Set<java.lang.annotation.Annotation>> . java.lang.Class<?> ( ) , org.springframework.data.repository.cdi.BeanManager , java.util.Optional . java.util.Optional ( getCustomImplementationDetector ( ) ) ) ; registerBean ( org.springframework.data.repository.cdi.DummyCdiExtension.DummyCdiRepositoryBean ) ; org.springframework.data.repository.cdi.AfterBeanDiscovery . addBean ( org.springframework.data.repository.cdi.DummyCdiExtension.DummyCdiRepositoryBean ) ; } }  <METHOD_END>
<METHOD_START> public void ( java.util.Set<java.lang.annotation.Annotation> < java.lang.annotation.Annotation > java.util.Set<java.lang.annotation.Annotation> , java.lang.Class<T> < T > java.lang.Class<T> , BeanManager org.springframework.data.repository.cdi.BeanManager ) { super( java.util.Set<java.lang.annotation.Annotation> , java.lang.Class<T> , org.springframework.data.repository.cdi.BeanManager ); }  <METHOD_END>
<METHOD_START> void ( java.util.Set<java.lang.annotation.Annotation> < java.lang.annotation.Annotation > java.util.Set<java.lang.annotation.Annotation> , java.lang.Class<T> < T > java.lang.Class<T> , BeanManager org.springframework.data.repository.cdi.BeanManager , java.util.Optional<org.springframework.data.repository.cdi.CustomRepositoryImplementationDetector> < CustomRepositoryImplementationDetector > java.util.Optional<org.springframework.data.repository.cdi.CustomRepositoryImplementationDetector> ) { super( java.util.Set<java.lang.annotation.Annotation> , java.lang.Class<T> , org.springframework.data.repository.cdi.BeanManager , java.util.Optional<org.springframework.data.repository.cdi.CustomRepositoryImplementationDetector> ); }  <METHOD_END>
<METHOD_START> public java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ( ) { return org.springframework.data.repository.cdi.DummyCdiExtension.MyScope .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected T T ( CreationalContext < T > org.springframework.data.repository.cdi.CreationalContext<T> , java.lang.Class<T> < T > java.lang.Class<T> , java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ) { return Mockito . mock ( java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super( org.springframework.data.repository.cdi.DummyCdiExtension.MyScope .class ); setActive ( true ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { componentInstanceMap = new java.util.HashMap <> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
