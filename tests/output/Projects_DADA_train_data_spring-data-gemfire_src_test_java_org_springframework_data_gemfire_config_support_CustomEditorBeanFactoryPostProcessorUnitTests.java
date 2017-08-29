<METHOD_START> protected org.springframework.data.gemfire.config.support.ConnectionEndpoint org.springframework.data.gemfire.config.support.ConnectionEndpoint ( java.lang.String java.lang.String , int int ) { return new ConnectionEndpoint ( java.lang.String , int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableListableBeanFactory org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory = mock ( ConfigurableListableBeanFactory .class ) ; new CustomEditorBeanFactoryPostProcessor ( ) . postProcessBeanFactory ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory ) ; verify ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory , times ( NUMBER ) ) . registerCustomEditor ( eq ( ConnectionEndpoint .class ) , eq ( CustomEditorBeanFactoryPostProcessor . CustomEditorBeanFactoryPostProcessor .class ) ) ; verify ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory , times ( NUMBER ) ) . registerCustomEditor ( eq ( ConnectionEndpointList .class ) , eq ( CustomEditorBeanFactoryPostProcessor . CustomEditorBeanFactoryPostProcessor .class ) ) ; verify ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory , times ( NUMBER ) ) . registerCustomEditor ( eq ( EvictionAction .class ) , eq ( EvictionActionConverter .class ) ) ; verify ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory , times ( NUMBER ) ) . registerCustomEditor ( eq ( EvictionPolicyType .class ) , eq ( EvictionPolicyConverter .class ) ) ; verify ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory , times ( NUMBER ) ) . registerCustomEditor ( eq ( ExpirationAction .class ) , eq ( ExpirationActionConverter .class ) ) ; verify ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory , times ( NUMBER ) ) . registerCustomEditor ( eq ( IndexMaintenancePolicyType .class ) , eq ( IndexMaintenancePolicyConverter .class ) ) ; verify ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory , times ( NUMBER ) ) . registerCustomEditor ( eq ( IndexType .class ) , eq ( IndexTypeConverter .class ) ) ; verify ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory , times ( NUMBER ) ) . registerCustomEditor ( eq ( InterestPolicy .class ) , eq ( InterestPolicyConverter .class ) ) ; verify ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory , times ( NUMBER ) ) . registerCustomEditor ( eq ( InterestResultPolicy .class ) , eq ( InterestResultPolicyConverter .class ) ) ; verify ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory , times ( NUMBER ) ) . registerCustomEditor ( eq ( Scope .class ) , eq ( ScopeConverter .class ) ) ; verify ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory , times ( NUMBER ) ) . registerCustomEditor ( eq ( Gateway . Gateway .class ) , eq ( OrderPolicyConverter .class ) ) ; verify ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory , times ( NUMBER ) ) . registerCustomEditor ( eq ( SubscriptionEvictionPolicy .class ) , eq ( SubscriptionEvictionPolicyConverter .class ) ) ; verifyNoMoreInteractions ( org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { ConnectionEndpoint [] org.springframework.data.gemfire.config.support.ConnectionEndpoint[] = { org.springframework.data.gemfire.config.support.ConnectionEndpoint ( STRING , NUMBER ) , org.springframework.data.gemfire.config.support.ConnectionEndpoint ( STRING , NUMBER ) } ; java.lang.Iterable<org.springframework.data.gemfire.config.support.ConnectionEndpoint> < ConnectionEndpoint > java.lang.Iterable<org.springframework.data.gemfire.config.support.ConnectionEndpoint> = new CustomEditorBeanFactoryPostProcessor . CustomEditorBeanFactoryPostProcessor ( ) . convert ( org.springframework.data.gemfire.config.support.ConnectionEndpoint[] ) ; assertThat ( java.lang.Iterable<org.springframework.data.gemfire.config.support.ConnectionEndpoint> ) . isNotNull ( ) ; int int = NUMBER ; for ( ConnectionEndpoint org.springframework.data.gemfire.config.support.ConnectionEndpoint : java.lang.Iterable<org.springframework.data.gemfire.config.support.ConnectionEndpoint> ) { assertThat ( org.springframework.data.gemfire.config.support.ConnectionEndpoint ) . isEqualTo ( org.springframework.data.gemfire.config.support.ConnectionEndpoint[] [ int ++ ] ) ; } assertThat ( int ) . isEqualTo ( array . length ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; ConnectionEndpoint org.springframework.data.gemfire.config.support.ConnectionEndpoint = new CustomEditorBeanFactoryPostProcessor . CustomEditorBeanFactoryPostProcessor ( ) . convert ( java.lang.String ) ; assertThat ( org.springframework.data.gemfire.config.support.ConnectionEndpoint ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.config.support.ConnectionEndpoint . getHost ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.config.support.ConnectionEndpoint . getPort ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String [] java.lang.String[] = { STRING , STRING , STRING } ; java.lang.String java.lang.String = StringUtils . arrayToCommaDelimitedString ( java.lang.String[] ) ; ConnectionEndpointList org.springframework.data.gemfire.config.support.ConnectionEndpointList = new CustomEditorBeanFactoryPostProcessor . CustomEditorBeanFactoryPostProcessor ( ) . convert ( java.lang.String ) ; assertThat ( org.springframework.data.gemfire.config.support.ConnectionEndpointList ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.config.support.ConnectionEndpointList . size ( ) ) . isEqualTo ( java.lang.String[] . int ) ; assertThat ( org.springframework.data.gemfire.config.support.ConnectionEndpointList . findOne ( STRING ) . getPort ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.gemfire.config.support.ConnectionEndpointList . findOne ( STRING ) . getPort ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.gemfire.config.support.ConnectionEndpointList . findOne ( NUMBER ) . getHost ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
