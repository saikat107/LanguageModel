<METHOD_START> @ Bean ( name = TransactionManagementConfigUtils . TRANSACTION_ADVISOR_BEAN_NAME ) @ Role ( BeanDefinition . ROLE_INFRASTRUCTURE ) public org.springframework.transaction.annotation.BeanFactoryTransactionAttributeSourceAdvisor org.springframework.transaction.annotation.BeanFactoryTransactionAttributeSourceAdvisor ( ) { BeanFactoryTransactionAttributeSourceAdvisor org.springframework.transaction.annotation.BeanFactoryTransactionAttributeSourceAdvisor = new BeanFactoryTransactionAttributeSourceAdvisor ( ) ; org.springframework.transaction.annotation.BeanFactoryTransactionAttributeSourceAdvisor . setTransactionAttributeSource ( org.springframework.transaction.annotation.TransactionAttributeSource ( ) ) ; org.springframework.transaction.annotation.BeanFactoryTransactionAttributeSourceAdvisor . setAdvice ( org.springframework.transaction.annotation.TransactionInterceptor ( ) ) ; org.springframework.transaction.annotation.BeanFactoryTransactionAttributeSourceAdvisor . setOrder ( this . enableTx .< java.lang.Integer > getNumber ( STRING ) ) ; return org.springframework.transaction.annotation.BeanFactoryTransactionAttributeSourceAdvisor ; }  <METHOD_END>
<METHOD_START> @ Bean @ Role ( BeanDefinition . ROLE_INFRASTRUCTURE ) public org.springframework.transaction.annotation.TransactionAttributeSource org.springframework.transaction.annotation.TransactionAttributeSource ( ) { return new AnnotationTransactionAttributeSource ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Role ( BeanDefinition . ROLE_INFRASTRUCTURE ) public org.springframework.transaction.annotation.TransactionInterceptor org.springframework.transaction.annotation.TransactionInterceptor ( ) { TransactionInterceptor org.springframework.transaction.annotation.TransactionInterceptor = new TransactionInterceptor ( ) ; org.springframework.transaction.annotation.TransactionInterceptor . setTransactionAttributeSource ( org.springframework.transaction.annotation.TransactionAttributeSource ( ) ) ; if ( this . txManager != null ) { org.springframework.transaction.annotation.TransactionInterceptor . setTransactionManager ( this . txManager ) ; } return org.springframework.transaction.annotation.TransactionInterceptor ; }  <METHOD_END>
