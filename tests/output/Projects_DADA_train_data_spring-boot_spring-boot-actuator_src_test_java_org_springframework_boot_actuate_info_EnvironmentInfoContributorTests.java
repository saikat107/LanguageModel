<METHOD_START> @ Test public void void ( ) { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.info.StandardEnvironment , STRING , STRING , STRING ) ; Info org.springframework.boot.actuate.info.Info = org.springframework.boot.actuate.info.Info ( this . org.springframework.boot.actuate.info.StandardEnvironment ) ; assertThat ( org.springframework.boot.actuate.info.Info . get ( STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.actuate.info.Info . get ( STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.actuate.info.Info . getDetails ( ) . size ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.info.StandardEnvironment , STRING ) ; Info org.springframework.boot.actuate.info.Info = org.springframework.boot.actuate.info.Info ( this . org.springframework.boot.actuate.info.StandardEnvironment ) ; assertThat ( org.springframework.boot.actuate.info.Info . getDetails ( ) . size ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.boot.actuate.info.Info org.springframework.boot.actuate.info.Info ( ConfigurableEnvironment org.springframework.boot.actuate.info.ConfigurableEnvironment ) { EnvironmentInfoContributor org.springframework.boot.actuate.info.EnvironmentInfoContributor = new EnvironmentInfoContributor ( org.springframework.boot.actuate.info.ConfigurableEnvironment ) ; Info . Info Info.Builder = new Info . Info ( ) ; org.springframework.boot.actuate.info.EnvironmentInfoContributor . contribute ( Info.Builder ) ; return Info.Builder . build ( ) ; }  <METHOD_END>
