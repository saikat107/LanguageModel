<METHOD_START> @ Test public void void ( ) { CollectionResourceMapping org.springframework.data.rest.core.mapping.CollectionResourceMapping = new TypeBasedCollectionResourceMapping ( org.springframework.data.rest.core.mapping.TypeBasedCollectionResourceMappingUnitTests.Sample .class ) ; assertThat ( org.springframework.data.rest.core.mapping.CollectionResourceMapping . getPath ( ) ) . isEqualTo ( new Path ( STRING ) ) ; assertThat ( org.springframework.data.rest.core.mapping.CollectionResourceMapping . getRel ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.rest.core.mapping.CollectionResourceMapping . getItemResourceRel ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.rest.core.mapping.CollectionResourceMapping . isExported ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CollectionResourceMapping org.springframework.data.rest.core.mapping.CollectionResourceMapping = new TypeBasedCollectionResourceMapping ( org.springframework.data.rest.core.mapping.TypeBasedCollectionResourceMappingUnitTests.CustomizedSample .class ) ; assertThat ( org.springframework.data.rest.core.mapping.CollectionResourceMapping . getPath ( ) ) . isEqualTo ( new Path ( STRING ) ) ; assertThat ( org.springframework.data.rest.core.mapping.CollectionResourceMapping . getRel ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.rest.core.mapping.CollectionResourceMapping . getItemResourceRel ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.rest.core.mapping.CollectionResourceMapping . isExported ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CollectionResourceMapping org.springframework.data.rest.core.mapping.CollectionResourceMapping = new TypeBasedCollectionResourceMapping ( org.springframework.data.rest.core.mapping.TypeBasedCollectionResourceMappingUnitTests.HiddenSample .class ) ; assertThat ( org.springframework.data.rest.core.mapping.CollectionResourceMapping . isExported ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CollectionResourceMapping org.springframework.data.rest.core.mapping.CollectionResourceMapping = new TypeBasedCollectionResourceMapping ( org.springframework.data.rest.core.mapping.TypeBasedCollectionResourceMappingUnitTests.Sample .class ) ; ResourceDescription org.springframework.data.rest.core.mapping.ResourceDescription = org.springframework.data.rest.core.mapping.CollectionResourceMapping . getDescription ( ) ; assertThat ( org.springframework.data.rest.core.mapping.ResourceDescription . isDefault ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.core.mapping.ResourceDescription . getMessage ( ) ) . isEqualTo ( STRING ) ; ResourceDescription org.springframework.data.rest.core.mapping.ResourceDescription = org.springframework.data.rest.core.mapping.CollectionResourceMapping . getItemResourceDescription ( ) ; assertThat ( org.springframework.data.rest.core.mapping.ResourceDescription . isDefault ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.core.mapping.ResourceDescription . getMessage ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
