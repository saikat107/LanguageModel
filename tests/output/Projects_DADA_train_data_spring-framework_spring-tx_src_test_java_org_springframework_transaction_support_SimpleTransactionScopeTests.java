<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { GenericApplicationContext org.springframework.transaction.support.GenericApplicationContext = new GenericApplicationContext ( ) ; org.springframework.transaction.support.GenericApplicationContext . getBeanFactory ( ) . registerScope ( STRING , new SimpleTransactionScope ( ) ) ; GenericBeanDefinition org.springframework.transaction.support.GenericBeanDefinition = new GenericBeanDefinition ( ) ; org.springframework.transaction.support.GenericBeanDefinition . setBeanClass ( TestBean .class ) ; org.springframework.transaction.support.GenericBeanDefinition . setScope ( STRING ) ; org.springframework.transaction.support.GenericBeanDefinition . setPrimary ( true ) ; org.springframework.transaction.support.GenericApplicationContext . registerBeanDefinition ( STRING , org.springframework.transaction.support.GenericBeanDefinition ) ; GenericBeanDefinition org.springframework.transaction.support.GenericBeanDefinition = new GenericBeanDefinition ( ) ; org.springframework.transaction.support.GenericBeanDefinition . setBeanClass ( DerivedTestBean .class ) ; org.springframework.transaction.support.GenericBeanDefinition . setScope ( STRING ) ; org.springframework.transaction.support.GenericApplicationContext . registerBeanDefinition ( STRING , org.springframework.transaction.support.GenericBeanDefinition ) ; org.springframework.transaction.support.GenericApplicationContext . refresh ( ) ; try { org.springframework.transaction.support.GenericApplicationContext . getBean ( TestBean .class ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.transaction.support.BeanCreationException ) { assertTrue ( org.springframework.transaction.support.BeanCreationException . getCause ( ) instanceof java.lang.IllegalStateException ) ; } try { org.springframework.transaction.support.GenericApplicationContext . getBean ( DerivedTestBean .class ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.transaction.support.BeanCreationException ) { assertTrue ( org.springframework.transaction.support.BeanCreationException . getCause ( ) instanceof java.lang.IllegalStateException ) ; } TestBean org.springframework.transaction.support.TestBean = null ; DerivedTestBean org.springframework.transaction.support.DerivedTestBean = null ; DerivedTestBean org.springframework.transaction.support.DerivedTestBean = null ; DerivedTestBean org.springframework.transaction.support.DerivedTestBean = null ; TransactionSynchronizationManager . initSynchronization ( ) ; try { org.springframework.transaction.support.TestBean = org.springframework.transaction.support.GenericApplicationContext . getBean ( TestBean .class ) ; assertSame ( org.springframework.transaction.support.TestBean , org.springframework.transaction.support.GenericApplicationContext . getBean ( TestBean .class ) ) ; org.springframework.transaction.support.DerivedTestBean = org.springframework.transaction.support.GenericApplicationContext . getBean ( DerivedTestBean .class ) ; assertSame ( org.springframework.transaction.support.DerivedTestBean , org.springframework.transaction.support.GenericApplicationContext . getBean ( DerivedTestBean .class ) ) ; org.springframework.transaction.support.GenericApplicationContext . getBeanFactory ( ) . destroyScopedBean ( STRING ) ; assertFalse ( TransactionSynchronizationManager . hasResource ( STRING ) ) ; assertTrue ( org.springframework.transaction.support.DerivedTestBean . wasDestroyed ( ) ) ; org.springframework.transaction.support.DerivedTestBean = org.springframework.transaction.support.GenericApplicationContext . getBean ( DerivedTestBean .class ) ; assertSame ( org.springframework.transaction.support.DerivedTestBean , org.springframework.transaction.support.GenericApplicationContext . getBean ( DerivedTestBean .class ) ) ; assertNotSame ( org.springframework.transaction.support.DerivedTestBean , org.springframework.transaction.support.DerivedTestBean ) ; org.springframework.transaction.support.GenericApplicationContext . getBeanFactory ( ) . getRegisteredScope ( STRING ) . remove ( STRING ) ; assertFalse ( TransactionSynchronizationManager . hasResource ( STRING ) ) ; assertFalse ( org.springframework.transaction.support.DerivedTestBean . wasDestroyed ( ) ) ; org.springframework.transaction.support.DerivedTestBean = org.springframework.transaction.support.GenericApplicationContext . getBean ( DerivedTestBean .class ) ; assertSame ( org.springframework.transaction.support.DerivedTestBean , org.springframework.transaction.support.GenericApplicationContext . getBean ( DerivedTestBean .class ) ) ; assertNotSame ( org.springframework.transaction.support.DerivedTestBean , org.springframework.transaction.support.DerivedTestBean ) ; assertNotSame ( org.springframework.transaction.support.DerivedTestBean , org.springframework.transaction.support.DerivedTestBean ) ; } finally { TransactionSynchronizationUtils . triggerAfterCompletion ( TransactionSynchronization . STATUS_COMMITTED ) ; TransactionSynchronizationManager . clearSynchronization ( ) ; } assertFalse ( org.springframework.transaction.support.DerivedTestBean . wasDestroyed ( ) ) ; assertTrue ( org.springframework.transaction.support.DerivedTestBean . wasDestroyed ( ) ) ; assertTrue ( TransactionSynchronizationManager . getResourceMap ( ) . isEmpty ( ) ) ; try { org.springframework.transaction.support.GenericApplicationContext . getBean ( TestBean .class ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.transaction.support.BeanCreationException ) { assertTrue ( org.springframework.transaction.support.BeanCreationException . getCause ( ) instanceof java.lang.IllegalStateException ) ; } try { org.springframework.transaction.support.GenericApplicationContext . getBean ( DerivedTestBean .class ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.transaction.support.BeanCreationException ) { assertTrue ( org.springframework.transaction.support.BeanCreationException . getCause ( ) instanceof java.lang.IllegalStateException ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try ( GenericApplicationContext org.springframework.transaction.support.GenericApplicationContext = new GenericApplicationContext ( ) ) { org.springframework.transaction.support.GenericApplicationContext . getBeanFactory ( ) . registerScope ( STRING , new SimpleTransactionScope ( ) ) ; GenericBeanDefinition org.springframework.transaction.support.GenericBeanDefinition = new GenericBeanDefinition ( ) ; org.springframework.transaction.support.GenericBeanDefinition . setBeanClass ( TestBean .class ) ; org.springframework.transaction.support.GenericBeanDefinition . setScope ( STRING ) ; org.springframework.transaction.support.GenericBeanDefinition . setPrimary ( true ) ; org.springframework.transaction.support.GenericApplicationContext . registerBeanDefinition ( STRING , org.springframework.transaction.support.GenericBeanDefinition ) ; GenericBeanDefinition org.springframework.transaction.support.GenericBeanDefinition = new GenericBeanDefinition ( ) ; org.springframework.transaction.support.GenericBeanDefinition . setBeanClass ( DerivedTestBean .class ) ; org.springframework.transaction.support.GenericBeanDefinition . setScope ( STRING ) ; org.springframework.transaction.support.GenericApplicationContext . registerBeanDefinition ( STRING , org.springframework.transaction.support.GenericBeanDefinition ) ; org.springframework.transaction.support.GenericApplicationContext . refresh ( ) ; CallCountingTransactionManager org.springframework.transaction.support.CallCountingTransactionManager = new CallCountingTransactionManager ( ) ; TransactionTemplate org.springframework.transaction.support.TransactionTemplate = new TransactionTemplate ( org.springframework.transaction.support.CallCountingTransactionManager ) ; java.util.Set<org.springframework.transaction.support.DerivedTestBean> < DerivedTestBean > java.util.Set<org.springframework.transaction.support.DerivedTestBean> = new java.util.HashSet<org.springframework.transaction.support.DerivedTestBean> <> ( ) ; org.springframework.transaction.support.TransactionTemplate . execute ( status -> { TestBean bean1 = context . getBean ( TestBean .class ) ; assertSame ( bean1 , context . getBean ( TestBean .class ) ) ; DerivedTestBean bean2 = context . getBean ( DerivedTestBean .class ) ; assertSame ( bean2 , context . getBean ( DerivedTestBean .class ) ) ; context . getBeanFactory ( ) . destroyScopedBean ( STRING ) ; assertFalse ( TransactionSynchronizationManager . hasResource ( STRING ) ) ; assertTrue ( bean2 . wasDestroyed ( ) ) ; DerivedTestBean bean2a = context . getBean ( DerivedTestBean .class ) ; assertSame ( bean2a , context . getBean ( DerivedTestBean .class ) ) ; assertNotSame ( bean2 , bean2a ) ; context . getBeanFactory ( ) . getRegisteredScope ( STRING ) . remove ( STRING ) ; assertFalse ( TransactionSynchronizationManager . hasResource ( STRING ) ) ; assertFalse ( bean2a . wasDestroyed ( ) ) ; DerivedTestBean bean2b = context . getBean ( DerivedTestBean .class ) ; finallyDestroy . add ( bean2b ) ; assertSame ( bean2b , context . getBean ( DerivedTestBean .class ) ) ; assertNotSame ( bean2 , bean2b ) ; assertNotSame ( bean2a , bean2b ) ; Set < DerivedTestBean > immediatelyDestroy = new HashSet <> ( ) ; TransactionTemplate tt2 = new TransactionTemplate ( tm ) ; tt2 . setPropagationBehavior ( TransactionTemplate . PROPAGATION_REQUIRED ) ; tt2 . execute ( status2 -> { DerivedTestBean bean2c = context . getBean ( DerivedTestBean .class ) ; immediatelyDestroy . add ( bean2c ) ; assertSame ( bean2c , context . getBean ( DerivedTestBean .class ) ) ; assertNotSame ( bean2 , bean2c ) ; assertNotSame ( bean2a , bean2c ) ; assertNotSame ( bean2b , bean2c ) ; return null ; } ) ; assertTrue ( immediatelyDestroy . iterator ( ) . next ( ) . wasDestroyed ( ) ) ; assertFalse ( bean2b . wasDestroyed ( ) ) ; return null ; } ) ; assertTrue ( java.util.Set<org.springframework.transaction.support.DerivedTestBean> . iterator ( ) . next ( ) . wasDestroyed ( ) ) ; } }  <METHOD_END>