<METHOD_START> @ Test public void void ( ) { IndexOperations org.springframework.data.mongodb.core.geo.IndexOperations = template . indexOps ( Venue .class ) ; java.util.List<org.springframework.data.mongodb.core.geo.IndexInfo> < IndexInfo > java.util.List<org.springframework.data.mongodb.core.geo.IndexInfo> = org.springframework.data.mongodb.core.geo.IndexOperations . getIndexInfo ( ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.geo.IndexInfo> . size ( ) , is ( NUMBER ) ) ; java.util.List<org.springframework.data.mongodb.core.geo.IndexField> < IndexField > java.util.List<org.springframework.data.mongodb.core.geo.IndexField> = java.util.List<org.springframework.data.mongodb.core.geo.IndexInfo> . get ( NUMBER ) . getIndexFields ( ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.geo.IndexField> . size ( ) , is ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.geo.IndexField> , hasItem ( IndexField . create ( STRING , Direction . ASC ) ) ) ; java.util.List<org.springframework.data.mongodb.core.geo.IndexField> = java.util.List<org.springframework.data.mongodb.core.geo.IndexInfo> . get ( NUMBER ) . getIndexFields ( ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.geo.IndexField> . size ( ) , is ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.geo.IndexField> , hasItem ( IndexField . geo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { NearQuery org.springframework.data.mongodb.core.geo.NearQuery = NearQuery . near ( - NUMBER , NUMBER , Metrics . KILOMETERS ) . num ( NUMBER ) . minDistance ( NUMBER ) ; GeoResults < Venue > org.springframework.data.mongodb.core.geo.GeoResults<org.springframework.data.mongodb.core.geo.Venue> = template . geoNear ( org.springframework.data.mongodb.core.geo.NearQuery , Venue .class ) ; assertThat ( org.springframework.data.mongodb.core.geo.GeoResults<org.springframework.data.mongodb.core.geo.Venue> . getContent ( ) . size ( ) , is ( not ( NUMBER ) ) ) ; assertThat ( org.springframework.data.mongodb.core.geo.GeoResults<org.springframework.data.mongodb.core.geo.Venue> . getAverageDistance ( ) . getMetric ( ) , is ( ( Metric ) Metrics . KILOMETERS ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Point org.springframework.data.mongodb.core.geo.Point = new Point ( - NUMBER , NUMBER ) ; java.util.List<org.springframework.data.mongodb.core.geo.Venue> < Venue > java.util.List<org.springframework.data.mongodb.core.geo.Venue> = template . find ( query ( where ( STRING ) . nearSphere ( org.springframework.data.mongodb.core.geo.Point ) . minDistance ( NUMBER ) ) , Venue .class ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.geo.Venue> . size ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { template . indexOps ( Venue .class ) . ensureIndex ( new GeospatialIndex ( STRING ) . typed ( GeoSpatialIndexType . GEO_2DSPHERE ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { template . indexOps ( Venue .class ) . dropIndex ( STRING ) ; }  <METHOD_END>