<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { GeoCommandStatistics . from ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GeoCommandStatistics org.springframework.data.mongodb.core.GeoCommandStatistics = GeoCommandStatistics . from ( new Document ( STRING , null ) ) ; assertThat ( org.springframework.data.mongodb.core.GeoCommandStatistics . getAverageDistance ( ) , is ( java.lang.Double . double ) ) ; org.springframework.data.mongodb.core.GeoCommandStatistics = GeoCommandStatistics . from ( new Document ( STRING , new Document ( ) ) ) ; assertThat ( org.springframework.data.mongodb.core.GeoCommandStatistics . getAverageDistance ( ) , is ( java.lang.Double . double ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GeoCommandStatistics org.springframework.data.mongodb.core.GeoCommandStatistics = GeoCommandStatistics . from ( new Document ( STRING , new Document ( STRING , NUMBER ) ) ) ; assertThat ( org.springframework.data.mongodb.core.GeoCommandStatistics . getAverageDistance ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
