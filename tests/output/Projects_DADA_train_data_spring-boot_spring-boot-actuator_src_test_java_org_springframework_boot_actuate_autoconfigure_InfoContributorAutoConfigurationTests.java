<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext != null ) { this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> < java.lang.String , InfoContributor > java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> = this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBeansOfType ( InfoContributor .class ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> < java.lang.String , InfoContributor > java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> = this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBeansOfType ( InfoContributor .class ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.actuate.autoconfigure.InfoContributorAutoConfigurationTests.CustomInfoContributorConfiguration .class , STRING ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> < java.lang.String , InfoContributor > java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> = this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBeansOfType ( InfoContributor .class ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> ) . hasSize ( NUMBER ) ; assertThat ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBean ( STRING ) ) . isSameAs ( java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> . values ( ) . iterator ( ) . next ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test public void void ( ) { void ( org.springframework.boot.actuate.autoconfigure.InfoContributorAutoConfigurationTests.GitPropertiesConfiguration .class ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> < java.lang.String , InfoContributor > java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> = this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBeansOfType ( InfoContributor .class ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> ) . containsKeys ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBean ( STRING , InfoContributor .class ) ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.lang.Object ) . isInstanceOf ( java.util.Map .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.lang.Object ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . containsOnlyKeys ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test public void void ( ) { void ( org.springframework.boot.actuate.autoconfigure.InfoContributorAutoConfigurationTests.GitPropertiesConfiguration .class , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBean ( STRING , InfoContributor .class ) ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.lang.Object ) . isInstanceOf ( java.util.Map .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.lang.Object ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . containsOnlyKeys ( STRING , STRING , STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.actuate.autoconfigure.InfoContributorAutoConfigurationTests.CustomGitInfoContributorConfiguration .class ) ; assertThat ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBean ( GitInfoContributor .class ) ) . isSameAs ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test public void void ( ) { void ( org.springframework.boot.actuate.autoconfigure.InfoContributorAutoConfigurationTests.BuildPropertiesConfiguration .class ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> < java.lang.String , InfoContributor > java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> = this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBeansOfType ( InfoContributor .class ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.boot.actuate.autoconfigure.InfoContributor> ) . containsKeys ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBean ( STRING , InfoContributor .class ) ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.lang.Object ) . isInstanceOf ( java.util.Map .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.lang.Object ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . containsOnlyKeys ( STRING , STRING , STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.actuate.autoconfigure.InfoContributorAutoConfigurationTests.CustomBuildInfoContributorConfiguration .class ) ; assertThat ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBean ( BuildInfoContributor .class ) ) . isSameAs ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( InfoContributor org.springframework.boot.actuate.autoconfigure.InfoContributor ) { Info . Info Info.Builder = new Info . Info ( ) ; org.springframework.boot.actuate.autoconfigure.InfoContributor . contribute ( Info.Builder ) ; return Info.Builder . build ( ) . getDetails ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String ... java.lang.String[] ) { void ( null , java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String ... java.lang.String[] ) { AnnotationConfigApplicationContext org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; if ( java.lang.Class<> != null ) { org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . register ( java.lang.Class<> ) ; } org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . register ( InfoContributorAutoConfiguration .class ) ; EnvironmentTestUtils . addEnvironment ( org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext , java.lang.String[] ) ; org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . refresh ( ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext = org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.GitProperties org.springframework.boot.actuate.autoconfigure.GitProperties ( ) { java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; return new GitProperties ( java.util.Properties ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.BuildProperties org.springframework.boot.actuate.autoconfigure.BuildProperties ( ) { java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; return new BuildProperties ( java.util.Properties ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.InfoContributor org.springframework.boot.actuate.autoconfigure.InfoContributor ( ) { return new InfoContributor ( ) { @ java.lang.Override public void void ( Info . Info Info.Builder ) {				} } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Info . Info Info.Builder ) {				}  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.GitInfoContributor org.springframework.boot.actuate.autoconfigure.GitInfoContributor ( ) { return new GitInfoContributor ( new GitProperties ( new java.util.Properties ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.BuildInfoContributor org.springframework.boot.actuate.autoconfigure.BuildInfoContributor ( ) { return new BuildInfoContributor ( new BuildProperties ( new java.util.Properties ( ) ) ) ; }  <METHOD_END>
