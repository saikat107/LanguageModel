<METHOD_START> public static java.lang.Iterable<java.lang.String> < java.lang.String > java.lang.Iterable<java.lang.String> ( ListableBeanFactory org.springframework.data.jpa.util.ListableBeanFactory ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> < java.lang.String > ( ) ; java.util.Set<java.lang.String> . boolean ( java.util.List ( beanNamesForTypeIncludingAncestors ( org.springframework.data.jpa.util.ListableBeanFactory , EntityManagerFactory .class , true , false ) ) ) ; for ( java.lang.String java.lang.String : beanNamesForTypeIncludingAncestors ( org.springframework.data.jpa.util.ListableBeanFactory , AbstractEntityManagerFactoryBean .class , true , false ) ) { java.util.Set<java.lang.String> . boolean ( transformedBeanName ( java.lang.String ) ) ; } return java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public static java.util.Collection<org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition> < org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition > java.util.Collection<org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition> ( ConfigurableListableBeanFactory org.springframework.data.jpa.util.ConfigurableListableBeanFactory ) { java.util.List<org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition> < org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition > java.util.List<org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition> = new java.util.ArrayList<org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition> < org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition > ( ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.util.List<java.lang.Class<?>> ) { for ( java.lang.String java.lang.String : org.springframework.data.jpa.util.ConfigurableListableBeanFactory . getBeanNamesForType ( java.lang.Class<> , true , false ) ) { void ( transformedBeanName ( java.lang.String ) , org.springframework.data.jpa.util.ConfigurableListableBeanFactory , java.util.List<org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition> ) ; } } BeanFactory org.springframework.data.jpa.util.BeanFactory = org.springframework.data.jpa.util.ConfigurableListableBeanFactory . getParentBeanFactory ( ) ; if ( org.springframework.data.jpa.util.BeanFactory instanceof ConfigurableListableBeanFactory ) { java.util.List<org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition> . boolean ( java.util.Collection<org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition> ( ( ConfigurableListableBeanFactory ) org.springframework.data.jpa.util.BeanFactory ) ) ; } return java.util.List<org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition> ; }  <METHOD_END>
<METHOD_START> private static void void ( java.lang.String java.lang.String , ConfigurableListableBeanFactory org.springframework.data.jpa.util.ConfigurableListableBeanFactory , java.util.List<org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition> < org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition > java.util.List<org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition> ) { BeanDefinition org.springframework.data.jpa.util.BeanDefinition = org.springframework.data.jpa.util.ConfigurableListableBeanFactory . getBeanDefinition ( java.lang.String ) ; if ( java.lang.String . boolean ( org.springframework.data.jpa.util.BeanDefinition . getBeanClassName ( ) ) ) { if ( ! EntityManagerFactory .class . java.lang.String ( ) . boolean ( org.springframework.data.jpa.util.BeanDefinition . getPropertyValues ( ) . get ( STRING ) ) ) { return; } } else if ( org.springframework.data.jpa.util.ConfigurableListableBeanFactory . getType ( java.lang.String ) == null || ! EntityManagerFactory .class . boolean ( org.springframework.data.jpa.util.ConfigurableListableBeanFactory . getType ( java.lang.String ) ) ) { return; } java.util.List<org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition> . boolean ( new org.springframework.data.jpa.util.BeanDefinitionUtils.EntityManagerFactoryBeanDefinition ( java.lang.String , org.springframework.data.jpa.util.ConfigurableListableBeanFactory ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.jpa.util.BeanDefinition org.springframework.data.jpa.util.BeanDefinition ( java.lang.String java.lang.String , ConfigurableListableBeanFactory org.springframework.data.jpa.util.ConfigurableListableBeanFactory ) { try { return org.springframework.data.jpa.util.ConfigurableListableBeanFactory . getBeanDefinition ( java.lang.String ) ; } catch ( NoSuchBeanDefinitionException org.springframework.data.jpa.util.NoSuchBeanDefinitionException ) { BeanFactory org.springframework.data.jpa.util.BeanFactory = org.springframework.data.jpa.util.ConfigurableListableBeanFactory . getParentBeanFactory ( ) ; if ( org.springframework.data.jpa.util.BeanFactory instanceof ConfigurableListableBeanFactory ) { return org.springframework.data.jpa.util.BeanDefinition ( java.lang.String , ( ConfigurableListableBeanFactory ) org.springframework.data.jpa.util.BeanFactory ) ; } throw org.springframework.data.jpa.util.NoSuchBeanDefinitionException ; } }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , ConfigurableListableBeanFactory org.springframework.data.jpa.util.ConfigurableListableBeanFactory ) { this . java.lang.String = java.lang.String ; this . org.springframework.data.jpa.util.ConfigurableListableBeanFactory = org.springframework.data.jpa.util.ConfigurableListableBeanFactory ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.jpa.util.BeanFactory org.springframework.data.jpa.util.BeanFactory ( ) { return org.springframework.data.jpa.util.ConfigurableListableBeanFactory ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.jpa.util.BeanDefinition org.springframework.data.jpa.util.BeanDefinition ( ) { return org.springframework.data.jpa.util.ConfigurableListableBeanFactory . getBeanDefinition ( java.lang.String ) ; }  <METHOD_END>