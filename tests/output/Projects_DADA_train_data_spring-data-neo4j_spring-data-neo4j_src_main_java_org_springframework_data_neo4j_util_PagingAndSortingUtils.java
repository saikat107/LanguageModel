<METHOD_START> public static org.springframework.data.neo4j.util.SortOrder org.springframework.data.neo4j.util.SortOrder ( Sort org.springframework.data.neo4j.util.Sort ) { SortOrder org.springframework.data.neo4j.util.SortOrder = new SortOrder ( ) ; if ( org.springframework.data.neo4j.util.Sort != Sort . unsorted ( ) ) { for ( Sort . Sort Sort.Order : org.springframework.data.neo4j.util.Sort ) { if ( Sort.Order . isAscending ( ) ) { org.springframework.data.neo4j.util.SortOrder . add ( Sort.Order . getProperty ( ) ) ; } else { org.springframework.data.neo4j.util.SortOrder . add ( SortOrder . Direction . DESC , Sort.Order . getProperty ( ) ) ; } } } return org.springframework.data.neo4j.util.SortOrder ; }  <METHOD_END>
