<METHOD_START> @ Test public void void ( ) { SmartLifecycle org.springframework.integration.support.SmartLifecycle = mock ( SmartLifecycle .class ) ; when ( org.springframework.integration.support.SmartLifecycle . getPhase ( ) ) . thenReturn ( NUMBER ) ; SmartLifecycle org.springframework.integration.support.SmartLifecycle = mock ( SmartLifecycle .class ) ; when ( org.springframework.integration.support.SmartLifecycle . getPhase ( ) ) . thenReturn ( NUMBER ) ; MultiValueMap < java.lang.String , SmartLifecycle > org.springframework.integration.support.MultiValueMap<java.lang.String,org.springframework.integration.support.SmartLifecycle> = new LinkedMultiValueMap < java.lang.String , SmartLifecycle > ( ) ; org.springframework.integration.support.MultiValueMap<java.lang.String,org.springframework.integration.support.SmartLifecycle> . add ( STRING , org.springframework.integration.support.SmartLifecycle ) ; org.springframework.integration.support.MultiValueMap<java.lang.String,org.springframework.integration.support.SmartLifecycle> . add ( STRING , org.springframework.integration.support.SmartLifecycle ) ; SmartLifecycleRoleController org.springframework.integration.support.SmartLifecycleRoleController = new SmartLifecycleRoleController ( org.springframework.integration.support.MultiValueMap<java.lang.String,org.springframework.integration.support.SmartLifecycle> ) ; org.springframework.integration.support.SmartLifecycleRoleController . startLifecyclesInRole ( STRING ) ; org.springframework.integration.support.SmartLifecycleRoleController . stopLifecyclesInRole ( STRING ) ; InOrder org.springframework.integration.support.InOrder = inOrder ( org.springframework.integration.support.SmartLifecycle , org.springframework.integration.support.SmartLifecycle ) ; org.springframework.integration.support.InOrder . verify ( org.springframework.integration.support.SmartLifecycle ) . start ( ) ; org.springframework.integration.support.InOrder . verify ( org.springframework.integration.support.SmartLifecycle ) . start ( ) ; org.springframework.integration.support.InOrder . verify ( org.springframework.integration.support.SmartLifecycle ) . stop ( ) ; org.springframework.integration.support.InOrder . verify ( org.springframework.integration.support.SmartLifecycle ) . stop ( ) ; }  <METHOD_END>