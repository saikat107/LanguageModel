<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new ProjectionDefinitionConfiguration ( ) . addProjection ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new ProjectionDefinitionConfiguration ( ) . addProjection ( java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new ProjectionDefinitionConfiguration ( ) . addProjection ( null , STRING , java.lang.Object .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new ProjectionDefinitionConfiguration ( ) . addProjection ( java.lang.String .class , ( java.lang.String ) null , java.lang.Object .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new ProjectionDefinitionConfiguration ( ) . addProjection ( java.lang.String .class , STRING , java.lang.Object .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new ProjectionDefinitionConfiguration ( ) . addProjection ( java.lang.String .class , STRING , new java.lang.Class<?> < ? > [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProjectionDefinitionConfiguration org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration = new ProjectionDefinitionConfiguration ( ) ; org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . addProjection ( java.lang.Integer .class , STRING , java.lang.String .class ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . getProjectionType ( java.lang.String .class , STRING ) ) . isEqualTo ( java.lang.Integer .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProjectionDefinitionConfiguration org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration = new ProjectionDefinitionConfiguration ( ) ; org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . addProjection ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.SampleProjection .class ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . getProjectionType ( java.lang.Integer .class , STRING ) ) . isEqualTo ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.SampleProjection .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProjectionDefinitionConfiguration org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration = new ProjectionDefinitionConfiguration ( ) ; org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . addProjection ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.Default .class ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . getProjectionType ( java.lang.Integer .class , STRING ) ) . isEqualTo ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.Default .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProjectionDefinition org.springframework.data.rest.core.config.ProjectionDefinition = ProjectionDefinition . of ( java.lang.Object .class , java.lang.Object .class , STRING ) ; ProjectionDefinition org.springframework.data.rest.core.config.ProjectionDefinition = ProjectionDefinition . of ( java.lang.Object .class , java.lang.Object .class , STRING ) ; ProjectionDefinition org.springframework.data.rest.core.config.ProjectionDefinition = ProjectionDefinition . of ( java.lang.String .class , java.lang.Object .class , STRING ) ; ProjectionDefinition org.springframework.data.rest.core.config.ProjectionDefinition = ProjectionDefinition . of ( java.lang.Object .class , java.lang.Object .class , STRING ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinition ) . isEqualTo ( org.springframework.data.rest.core.config.ProjectionDefinition ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinition ) . isEqualTo ( org.springframework.data.rest.core.config.ProjectionDefinition ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinition ) . isEqualTo ( org.springframework.data.rest.core.config.ProjectionDefinition ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinition ) . isNotEqualTo ( org.springframework.data.rest.core.config.ProjectionDefinition ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinition ) . isNotEqualTo ( org.springframework.data.rest.core.config.ProjectionDefinition ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinition ) . isNotEqualTo ( org.springframework.data.rest.core.config.ProjectionDefinition ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinition ) . isNotEqualTo ( org.springframework.data.rest.core.config.ProjectionDefinition ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinition ) . isNotEqualTo ( new java.lang.Object ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProjectionDefinitionConfiguration org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration = new ProjectionDefinitionConfiguration ( ) ; org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . addProjection ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.ParentProjection .class ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . hasProjectionFor ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.Child .class ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . getProjectionsFor ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.Child .class ) . values ( ) ) . contains ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.ParentProjection .class ) ; assertThat ( org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . getProjectionType ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.Child .class , STRING ) ) . isAssignableFrom ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.ParentProjection .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new ProjectionDefinitionConfiguration ( ) . getParameterName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProjectionDefinitionConfiguration org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration = new ProjectionDefinitionConfiguration ( ) ; org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . addProjection ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.ParentProjection .class ) ; org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . addProjection ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.ChildProjection .class ) ; java.util.Map<java.lang.String,java.lang.Class<?>> < java.lang.String , java.lang.Class<?> < ? > > java.util.Map<java.lang.String,java.lang.Class<?>> = org.springframework.data.rest.core.config.ProjectionDefinitionConfiguration . getProjectionsFor ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.Child .class ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Class<?>> . java.util.Collection<java.lang.Class<?>> ( ) ) . hasSize ( NUMBER ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Class<?>> . java.util.Collection<java.lang.Class<?>> ( ) ) . contains ( org.springframework.data.rest.core.config.ProjectionDefinitionConfigurationUnitTests.ChildProjection .class ) ; }  <METHOD_END>