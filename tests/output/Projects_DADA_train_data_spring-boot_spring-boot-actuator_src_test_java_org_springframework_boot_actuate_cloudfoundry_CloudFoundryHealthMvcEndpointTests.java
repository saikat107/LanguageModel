<METHOD_START> @ Test public void void ( ) java.lang.Exception { HealthEndpoint org.springframework.boot.actuate.cloudfoundry.HealthEndpoint = mock ( HealthEndpoint .class ) ; given ( org.springframework.boot.actuate.cloudfoundry.HealthEndpoint . isEnabled ( ) ) . willReturn ( true ) ; CloudFoundryHealthMvcEndpoint org.springframework.boot.actuate.cloudfoundry.CloudFoundryHealthMvcEndpoint = new CloudFoundryHealthMvcEndpoint ( org.springframework.boot.actuate.cloudfoundry.HealthEndpoint ) ; given ( org.springframework.boot.actuate.cloudfoundry.HealthEndpoint . invoke ( ) ) . willReturn ( new Health . Health ( ) . up ( ) . withDetail ( STRING , STRING ) . build ( ) ) ; given ( org.springframework.boot.actuate.cloudfoundry.HealthEndpoint . isSensitive ( ) ) . willReturn ( false ) ; java.lang.Object java.lang.Object = org.springframework.boot.actuate.cloudfoundry.CloudFoundryHealthMvcEndpoint . invoke ( null , null ) ; assertThat ( java.lang.Object instanceof Health ) . isTrue ( ) ; assertThat ( ( ( Health ) java.lang.Object ) . getStatus ( ) == Status . UP ) . isTrue ( ) ; assertThat ( ( ( Health ) java.lang.Object ) . getDetails ( ) . get ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
