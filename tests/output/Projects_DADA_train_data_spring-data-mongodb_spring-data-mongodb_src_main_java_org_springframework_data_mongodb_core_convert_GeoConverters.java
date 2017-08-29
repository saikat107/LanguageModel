<METHOD_START> private void ( ) {}  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public static java.util.Collection<? extends java.lang.Object> < ? extends java.lang.Object > java.util.Collection<? extends java.lang.Object> ( ) { return java.util.Arrays . java.util.List<java.lang.Enum<?>> ( org.springframework.data.mongodb.core.convert.GeoConverters.BoxToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.BoxToDocumentConverter , org.springframework.data.mongodb.core.convert.GeoConverters.PolygonToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.PolygonToDocumentConverter , org.springframework.data.mongodb.core.convert.GeoConverters.CircleToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.CircleToDocumentConverter , org.springframework.data.mongodb.core.convert.GeoConverters.SphereToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.SphereToDocumentConverter , org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToBoxConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToBoxConverter , org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPolygonConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPolygonConverter , org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToCircleConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToCircleConverter , org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToSphereConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToSphereConverter , org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPointConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPointConverter , org.springframework.data.mongodb.core.convert.GeoConverters.PointToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.PointToDocumentConverter , org.springframework.data.mongodb.core.convert.GeoConverters.GeoCommandToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.GeoCommandToDocumentConverter , org.springframework.data.mongodb.core.convert.GeoConverters.GeoJsonToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.GeoJsonToDocumentConverter , org.springframework.data.mongodb.core.convert.GeoConverters.GeoJsonPointToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.GeoJsonPointToDocumentConverter , org.springframework.data.mongodb.core.convert.GeoConverters.GeoJsonPolygonToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.GeoJsonPolygonToDocumentConverter , org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonPointConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonPointConverter , org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonPolygonConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonPolygonConverter , org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonLineStringConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonLineStringConverter , org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonMultiLineStringConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonMultiLineStringConverter , org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonMultiPointConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonMultiPointConverter , org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonMultiPolygonConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonMultiPolygonConverter , org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonGeometryCollectionConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonGeometryCollectionConverter ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.Point org.springframework.data.mongodb.core.convert.Point ( Document org.springframework.data.mongodb.core.convert.Document ) { if ( org.springframework.data.mongodb.core.convert.Document == null ) { return null ; } Assert . isTrue ( org.springframework.data.mongodb.core.convert.Document . keySet ( ) . size ( ) == NUMBER , STRING ) ; if ( org.springframework.data.mongodb.core.convert.Document . containsKey ( STRING ) ) { return org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonPointConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonPointConverter . org.springframework.data.mongodb.core.convert.GeoJsonPoint ( org.springframework.data.mongodb.core.convert.Document ) ; } return new Point ( double ( org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) , double ( org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.Document org.springframework.data.mongodb.core.convert.Document ( Point org.springframework.data.mongodb.core.convert.Point ) { return org.springframework.data.mongodb.core.convert.Point == null ? null : new Document ( STRING , org.springframework.data.mongodb.core.convert.Point . getX ( ) ) . append ( STRING , org.springframework.data.mongodb.core.convert.Point . getY ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.Document org.springframework.data.mongodb.core.convert.Document ( Box org.springframework.data.mongodb.core.convert.Box ) { if ( org.springframework.data.mongodb.core.convert.Box == null ) { return null ; } Document org.springframework.data.mongodb.core.convert.Document = new Document ( ) ; org.springframework.data.mongodb.core.convert.Document . put ( STRING , org.springframework.data.mongodb.core.convert.GeoConverters.PointToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.PointToDocumentConverter . org.springframework.data.mongodb.core.convert.Document ( org.springframework.data.mongodb.core.convert.Box . getFirst ( ) ) ) ; org.springframework.data.mongodb.core.convert.Document . put ( STRING , org.springframework.data.mongodb.core.convert.GeoConverters.PointToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.PointToDocumentConverter . org.springframework.data.mongodb.core.convert.Document ( org.springframework.data.mongodb.core.convert.Box . getSecond ( ) ) ) ; return org.springframework.data.mongodb.core.convert.Document ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.Box org.springframework.data.mongodb.core.convert.Box ( Document org.springframework.data.mongodb.core.convert.Document ) { if ( org.springframework.data.mongodb.core.convert.Document == null ) { return null ; } Point org.springframework.data.mongodb.core.convert.Point = org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPointConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPointConverter . org.springframework.data.mongodb.core.convert.Point ( ( Document ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) ; Point org.springframework.data.mongodb.core.convert.Point = org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPointConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPointConverter . org.springframework.data.mongodb.core.convert.Point ( ( Document ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) ; return new Box ( org.springframework.data.mongodb.core.convert.Point , org.springframework.data.mongodb.core.convert.Point ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.Document org.springframework.data.mongodb.core.convert.Document ( Circle org.springframework.data.mongodb.core.convert.Circle ) { if ( org.springframework.data.mongodb.core.convert.Circle == null ) { return null ; } Document org.springframework.data.mongodb.core.convert.Document = new Document ( ) ; org.springframework.data.mongodb.core.convert.Document . put ( STRING , org.springframework.data.mongodb.core.convert.GeoConverters.PointToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.PointToDocumentConverter . org.springframework.data.mongodb.core.convert.Document ( org.springframework.data.mongodb.core.convert.Circle . getCenter ( ) ) ) ; org.springframework.data.mongodb.core.convert.Document . put ( STRING , org.springframework.data.mongodb.core.convert.Circle . getRadius ( ) . getNormalizedValue ( ) ) ; org.springframework.data.mongodb.core.convert.Document . put ( STRING , org.springframework.data.mongodb.core.convert.Circle . getRadius ( ) . getMetric ( ) . toString ( ) ) ; return org.springframework.data.mongodb.core.convert.Document ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.Circle org.springframework.data.mongodb.core.convert.Circle ( Document org.springframework.data.mongodb.core.convert.Document ) { if ( org.springframework.data.mongodb.core.convert.Document == null ) { return null ; } Document org.springframework.data.mongodb.core.convert.Document = ( Document ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; java.lang.Number java.lang.Number = ( java.lang.Number ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; Assert . notNull ( org.springframework.data.mongodb.core.convert.Document , STRING ) ; Assert . notNull ( java.lang.Number , STRING ) ; Distance org.springframework.data.mongodb.core.convert.Distance = new Distance ( double ( java.lang.Number ) ) ; if ( org.springframework.data.mongodb.core.convert.Document . containsKey ( STRING ) ) { java.lang.String java.lang.String = ( java.lang.String ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; Assert . notNull ( java.lang.String , STRING ) ; org.springframework.data.mongodb.core.convert.Distance = org.springframework.data.mongodb.core.convert.Distance . in ( Metrics . valueOf ( java.lang.String ) ) ; } return new Circle ( org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPointConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPointConverter . org.springframework.data.mongodb.core.convert.Point ( org.springframework.data.mongodb.core.convert.Document ) , org.springframework.data.mongodb.core.convert.Distance ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.Document org.springframework.data.mongodb.core.convert.Document ( Sphere org.springframework.data.mongodb.core.convert.Sphere ) { if ( org.springframework.data.mongodb.core.convert.Sphere == null ) { return null ; } Document org.springframework.data.mongodb.core.convert.Document = new Document ( ) ; org.springframework.data.mongodb.core.convert.Document . put ( STRING , org.springframework.data.mongodb.core.convert.GeoConverters.PointToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.PointToDocumentConverter . org.springframework.data.mongodb.core.convert.Document ( org.springframework.data.mongodb.core.convert.Sphere . getCenter ( ) ) ) ; org.springframework.data.mongodb.core.convert.Document . put ( STRING , org.springframework.data.mongodb.core.convert.Sphere . getRadius ( ) . getNormalizedValue ( ) ) ; org.springframework.data.mongodb.core.convert.Document . put ( STRING , org.springframework.data.mongodb.core.convert.Sphere . getRadius ( ) . getMetric ( ) . toString ( ) ) ; return org.springframework.data.mongodb.core.convert.Document ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.Sphere org.springframework.data.mongodb.core.convert.Sphere ( Document org.springframework.data.mongodb.core.convert.Document ) { if ( org.springframework.data.mongodb.core.convert.Document == null ) { return null ; } Document org.springframework.data.mongodb.core.convert.Document = ( Document ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; java.lang.Number java.lang.Number = ( java.lang.Number ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; Assert . notNull ( org.springframework.data.mongodb.core.convert.Document , STRING ) ; Assert . notNull ( java.lang.Number , STRING ) ; Distance org.springframework.data.mongodb.core.convert.Distance = new Distance ( double ( java.lang.Number ) ) ; if ( org.springframework.data.mongodb.core.convert.Document . containsKey ( STRING ) ) { java.lang.String java.lang.String = ( java.lang.String ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; Assert . notNull ( java.lang.String , STRING ) ; org.springframework.data.mongodb.core.convert.Distance = org.springframework.data.mongodb.core.convert.Distance . in ( Metrics . valueOf ( java.lang.String ) ) ; } return new Sphere ( org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPointConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPointConverter . org.springframework.data.mongodb.core.convert.Point ( org.springframework.data.mongodb.core.convert.Document ) , org.springframework.data.mongodb.core.convert.Distance ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.Document org.springframework.data.mongodb.core.convert.Document ( Polygon org.springframework.data.mongodb.core.convert.Polygon ) { if ( org.springframework.data.mongodb.core.convert.Polygon == null ) { return null ; } java.util.List<org.springframework.data.mongodb.core.convert.Point> < Point > java.util.List<org.springframework.data.mongodb.core.convert.Point> = org.springframework.data.mongodb.core.convert.Polygon . getPoints ( ) ; java.util.List<org.springframework.data.mongodb.core.convert.Document> < Document > java.util.List<org.springframework.data.mongodb.core.convert.Document> = new java.util.ArrayList<org.springframework.data.mongodb.core.convert.Document> < Document > ( java.util.List<org.springframework.data.mongodb.core.convert.Point> . size ( ) ) ; for ( Point org.springframework.data.mongodb.core.convert.Point : java.util.List<org.springframework.data.mongodb.core.convert.Point> ) { java.util.List<org.springframework.data.mongodb.core.convert.Document> . add ( org.springframework.data.mongodb.core.convert.GeoConverters.PointToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.PointToDocumentConverter . org.springframework.data.mongodb.core.convert.Document ( org.springframework.data.mongodb.core.convert.Point ) ) ; } Document org.springframework.data.mongodb.core.convert.Document = new Document ( ) ; org.springframework.data.mongodb.core.convert.Document . put ( STRING , java.util.List<org.springframework.data.mongodb.core.convert.Document> ) ; return org.springframework.data.mongodb.core.convert.Document ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( { STRING } ) public org.springframework.data.mongodb.core.convert.Polygon org.springframework.data.mongodb.core.convert.Polygon ( Document org.springframework.data.mongodb.core.convert.Document ) { if ( org.springframework.data.mongodb.core.convert.Document == null ) { return null ; } java.util.List<org.springframework.data.mongodb.core.convert.Document> < Document > java.util.List<org.springframework.data.mongodb.core.convert.Document> = ( java.util.List<org.springframework.data.mongodb.core.convert.Document> < Document > ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; java.util.List<org.springframework.data.mongodb.core.convert.Point> < Point > java.util.List<org.springframework.data.mongodb.core.convert.Point> = new java.util.ArrayList<org.springframework.data.mongodb.core.convert.Point> < Point > ( java.util.List<org.springframework.data.mongodb.core.convert.Document> . size ( ) ) ; for ( Document org.springframework.data.mongodb.core.convert.Document : java.util.List<org.springframework.data.mongodb.core.convert.Document> ) { Assert . notNull ( org.springframework.data.mongodb.core.convert.Document , STRING ) ; java.util.List<org.springframework.data.mongodb.core.convert.Point> . add ( org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPointConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToPointConverter . org.springframework.data.mongodb.core.convert.Point ( org.springframework.data.mongodb.core.convert.Document ) ) ; } return new Polygon ( java.util.List<org.springframework.data.mongodb.core.convert.Point> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public org.springframework.data.mongodb.core.convert.Document org.springframework.data.mongodb.core.convert.Document ( GeoCommand org.springframework.data.mongodb.core.convert.GeoCommand ) { if ( org.springframework.data.mongodb.core.convert.GeoCommand == null ) { return null ; } java.util.List java.util.List = new java.util.ArrayList ( ) ; Shape org.springframework.data.mongodb.core.convert.Shape = org.springframework.data.mongodb.core.convert.GeoCommand . getShape ( ) ; if ( org.springframework.data.mongodb.core.convert.Shape instanceof GeoJson ) { return org.springframework.data.mongodb.core.convert.GeoConverters.GeoJsonToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.GeoJsonToDocumentConverter . org.springframework.data.mongodb.core.convert.Document ( ( GeoJson ) org.springframework.data.mongodb.core.convert.Shape ) ; } if ( org.springframework.data.mongodb.core.convert.Shape instanceof Box ) { java.util.List . boolean ( java.util.List<java.lang.Double> ( ( ( Box ) org.springframework.data.mongodb.core.convert.Shape ) . getFirst ( ) ) ) ; java.util.List . boolean ( java.util.List<java.lang.Double> ( ( ( Box ) org.springframework.data.mongodb.core.convert.Shape ) . getSecond ( ) ) ) ; } else if ( org.springframework.data.mongodb.core.convert.Shape instanceof Circle ) { java.util.List . boolean ( java.util.List<java.lang.Double> ( ( ( Circle ) org.springframework.data.mongodb.core.convert.Shape ) . getCenter ( ) ) ) ; java.util.List . boolean ( ( ( Circle ) org.springframework.data.mongodb.core.convert.Shape ) . getRadius ( ) . getNormalizedValue ( ) ) ; } else if ( org.springframework.data.mongodb.core.convert.Shape instanceof Circle ) { java.util.List . boolean ( java.util.List<java.lang.Double> ( ( ( Circle ) org.springframework.data.mongodb.core.convert.Shape ) . getCenter ( ) ) ) ; java.util.List . boolean ( ( ( Circle ) org.springframework.data.mongodb.core.convert.Shape ) . getRadius ( ) ) ; } else if ( org.springframework.data.mongodb.core.convert.Shape instanceof Polygon ) { for ( Point org.springframework.data.mongodb.core.convert.Point : ( ( Polygon ) org.springframework.data.mongodb.core.convert.Shape ) . getPoints ( ) ) { java.util.List . boolean ( java.util.List<java.lang.Double> ( org.springframework.data.mongodb.core.convert.Point ) ) ; } } else if ( org.springframework.data.mongodb.core.convert.Shape instanceof Sphere ) { java.util.List . boolean ( java.util.List<java.lang.Double> ( ( ( Sphere ) org.springframework.data.mongodb.core.convert.Shape ) . getCenter ( ) ) ) ; java.util.List . boolean ( ( ( Sphere ) org.springframework.data.mongodb.core.convert.Shape ) . getRadius ( ) . getNormalizedValue ( ) ) ; } return new Document ( org.springframework.data.mongodb.core.convert.GeoCommand . getCommand ( ) , java.util.List ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.Document org.springframework.data.mongodb.core.convert.Document ( GeoJson org.springframework.data.mongodb.core.convert.GeoJson ) { if ( org.springframework.data.mongodb.core.convert.GeoJson == null ) { return null ; } Document org.springframework.data.mongodb.core.convert.Document = new Document ( STRING , org.springframework.data.mongodb.core.convert.GeoJson . getType ( ) ) ; if ( org.springframework.data.mongodb.core.convert.GeoJson instanceof GeoJsonGeometryCollection ) { java.util.List java.util.List = new java.util.ArrayList ( ) ; for ( GeoJson org.springframework.data.mongodb.core.convert.GeoJson : ( ( GeoJsonGeometryCollection ) org.springframework.data.mongodb.core.convert.GeoJson ) . getCoordinates ( ) ) { java.util.List . boolean ( org.springframework.data.mongodb.core.convert.Document ( org.springframework.data.mongodb.core.convert.GeoJson ) ) ; } org.springframework.data.mongodb.core.convert.Document . put ( STRING , java.util.List ) ; } else { org.springframework.data.mongodb.core.convert.Document . put ( STRING , java.lang.Object ( org.springframework.data.mongodb.core.convert.GeoJson . getCoordinates ( ) ) ) ; } return org.springframework.data.mongodb.core.convert.Document ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof GeoJson ) { return java.lang.Object ( ( ( GeoJson ) java.lang.Object ) . getCoordinates ( ) ) ; } if ( java.lang.Object instanceof java.lang.Iterable ) { java.util.List java.util.List = new java.util.ArrayList ( ) ; for ( java.lang.Object java.lang.Object : ( java.lang.Iterable ) java.lang.Object ) { java.util.List . boolean ( java.lang.Object ( java.lang.Object ) ) ; } return java.util.List ; } if ( java.lang.Object instanceof Point ) { return java.util.List<java.lang.Double> ( ( Point ) java.lang.Object ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.Document org.springframework.data.mongodb.core.convert.Document ( GeoJsonPoint org.springframework.data.mongodb.core.convert.GeoJsonPoint ) { return org.springframework.data.mongodb.core.convert.GeoConverters.GeoJsonToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.GeoJsonToDocumentConverter . org.springframework.data.mongodb.core.convert.Document ( org.springframework.data.mongodb.core.convert.GeoJsonPoint ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.Document org.springframework.data.mongodb.core.convert.Document ( GeoJsonPolygon org.springframework.data.mongodb.core.convert.GeoJsonPolygon ) { return org.springframework.data.mongodb.core.convert.GeoConverters.GeoJsonToDocumentConverter . org.springframework.data.mongodb.core.convert.GeoConverters.GeoJsonToDocumentConverter . org.springframework.data.mongodb.core.convert.Document ( org.springframework.data.mongodb.core.convert.GeoJsonPolygon ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public org.springframework.data.mongodb.core.convert.GeoJsonPoint org.springframework.data.mongodb.core.convert.GeoJsonPoint ( Document org.springframework.data.mongodb.core.convert.Document ) { if ( org.springframework.data.mongodb.core.convert.Document == null ) { return null ; } Assert . isTrue ( ObjectUtils . nullSafeEquals ( org.springframework.data.mongodb.core.convert.Document . get ( STRING ) , STRING ) , java.lang.String . java.lang.String ( STRING , org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) ) ; java.util.List<java.lang.Number> < java.lang.Number > java.util.List<java.lang.Number> = ( java.util.List<java.lang.Number> < java.lang.Number > ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; return new GeoJsonPoint ( double ( java.util.List<java.lang.Number> . java.lang.Number ( NUMBER ) ) , double ( java.util.List<java.lang.Number> . java.lang.Number ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.GeoJsonPolygon org.springframework.data.mongodb.core.convert.GeoJsonPolygon ( Document org.springframework.data.mongodb.core.convert.Document ) { if ( org.springframework.data.mongodb.core.convert.Document == null ) { return null ; } Assert . isTrue ( ObjectUtils . nullSafeEquals ( org.springframework.data.mongodb.core.convert.Document . get ( STRING ) , STRING ) , java.lang.String . java.lang.String ( STRING , org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) ) ; return org.springframework.data.mongodb.core.convert.GeoJsonPolygon ( ( java.util.List ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.GeoJsonMultiPolygon org.springframework.data.mongodb.core.convert.GeoJsonMultiPolygon ( Document org.springframework.data.mongodb.core.convert.Document ) { if ( org.springframework.data.mongodb.core.convert.Document == null ) { return null ; } Assert . isTrue ( ObjectUtils . nullSafeEquals ( org.springframework.data.mongodb.core.convert.Document . get ( STRING ) , STRING ) , java.lang.String . java.lang.String ( STRING , org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) ) ; java.util.List java.util.List = ( java.util.List ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; java.util.List<org.springframework.data.mongodb.core.convert.GeoJsonPolygon> < GeoJsonPolygon > java.util.List<org.springframework.data.mongodb.core.convert.GeoJsonPolygon> = new java.util.ArrayList<org.springframework.data.mongodb.core.convert.GeoJsonPolygon> < GeoJsonPolygon > ( ) ; for ( java.lang.Object java.lang.Object : java.util.List ) { java.util.List<org.springframework.data.mongodb.core.convert.GeoJsonPolygon> . add ( org.springframework.data.mongodb.core.convert.GeoJsonPolygon ( ( java.util.List ) java.lang.Object ) ) ; } return new GeoJsonMultiPolygon ( java.util.List<org.springframework.data.mongodb.core.convert.GeoJsonPolygon> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.GeoJsonLineString org.springframework.data.mongodb.core.convert.GeoJsonLineString ( Document org.springframework.data.mongodb.core.convert.Document ) { if ( org.springframework.data.mongodb.core.convert.Document == null ) { return null ; } Assert . isTrue ( ObjectUtils . nullSafeEquals ( org.springframework.data.mongodb.core.convert.Document . get ( STRING ) , STRING ) , java.lang.String . java.lang.String ( STRING , org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) ) ; java.util.List java.util.List = ( java.util.List ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; return new GeoJsonLineString ( java.util.List<org.springframework.data.mongodb.core.convert.Point> ( java.util.List ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.GeoJsonMultiPoint org.springframework.data.mongodb.core.convert.GeoJsonMultiPoint ( Document org.springframework.data.mongodb.core.convert.Document ) { if ( org.springframework.data.mongodb.core.convert.Document == null ) { return null ; } Assert . isTrue ( ObjectUtils . nullSafeEquals ( org.springframework.data.mongodb.core.convert.Document . get ( STRING ) , STRING ) , java.lang.String . java.lang.String ( STRING , org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) ) ; java.util.List java.util.List = ( java.util.List ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; return new GeoJsonMultiPoint ( java.util.List<org.springframework.data.mongodb.core.convert.Point> ( java.util.List ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.GeoJsonMultiLineString org.springframework.data.mongodb.core.convert.GeoJsonMultiLineString ( Document org.springframework.data.mongodb.core.convert.Document ) { if ( org.springframework.data.mongodb.core.convert.Document == null ) { return null ; } Assert . isTrue ( ObjectUtils . nullSafeEquals ( org.springframework.data.mongodb.core.convert.Document . get ( STRING ) , STRING ) , java.lang.String . java.lang.String ( STRING , org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) ) ; java.util.List<org.springframework.data.mongodb.core.convert.GeoJsonLineString> < GeoJsonLineString > java.util.List<org.springframework.data.mongodb.core.convert.GeoJsonLineString> = new java.util.ArrayList<org.springframework.data.mongodb.core.convert.GeoJsonLineString> < GeoJsonLineString > ( ) ; java.util.List java.util.List = ( java.util.List ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; for ( java.lang.Object java.lang.Object : java.util.List ) { java.util.List<org.springframework.data.mongodb.core.convert.GeoJsonLineString> . add ( new GeoJsonLineString ( java.util.List<org.springframework.data.mongodb.core.convert.Point> ( ( java.util.List ) java.lang.Object ) ) ) ; } return new GeoJsonMultiLineString ( java.util.List<org.springframework.data.mongodb.core.convert.GeoJsonLineString> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public org.springframework.data.mongodb.core.convert.GeoJsonGeometryCollection org.springframework.data.mongodb.core.convert.GeoJsonGeometryCollection ( Document org.springframework.data.mongodb.core.convert.Document ) { if ( org.springframework.data.mongodb.core.convert.Document == null ) { return null ; } Assert . isTrue ( ObjectUtils . nullSafeEquals ( org.springframework.data.mongodb.core.convert.Document . get ( STRING ) , STRING ) , java.lang.String . java.lang.String ( STRING , org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) ) ; java.util.List<org.springframework.data.mongodb.core.convert.GeoJson<?>> < GeoJson < ? > > java.util.List<org.springframework.data.mongodb.core.convert.GeoJson<?>> = new java.util.ArrayList<org.springframework.data.mongodb.core.convert.GeoJson<?>> < GeoJson < ? > > ( ) ; for ( java.lang.Object java.lang.Object : ( java.util.List ) org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ) { java.util.List<org.springframework.data.mongodb.core.convert.GeoJson<?>> . add ( org.springframework.data.mongodb.core.convert.GeoJson<?> ( ( Document ) java.lang.Object ) ) ; } return new GeoJsonGeometryCollection ( java.util.List<org.springframework.data.mongodb.core.convert.GeoJson<?>> ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.mongodb.core.convert.GeoJson<?> < ? > org.springframework.data.mongodb.core.convert.GeoJson<?> ( Document org.springframework.data.mongodb.core.convert.Document ) { java.lang.Object java.lang.Object = org.springframework.data.mongodb.core.convert.Document . get ( STRING ) ; if ( ObjectUtils . nullSafeEquals ( java.lang.Object , STRING ) ) { return org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonPointConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonPointConverter . org.springframework.data.mongodb.core.convert.GeoJsonPoint ( org.springframework.data.mongodb.core.convert.Document ) ; } if ( ObjectUtils . nullSafeEquals ( java.lang.Object , STRING ) ) { return org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonMultiPointConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonMultiPointConverter . org.springframework.data.mongodb.core.convert.GeoJsonMultiPoint ( org.springframework.data.mongodb.core.convert.Document ) ; } if ( ObjectUtils . nullSafeEquals ( java.lang.Object , STRING ) ) { return org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonLineStringConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonLineStringConverter . org.springframework.data.mongodb.core.convert.GeoJsonLineString ( org.springframework.data.mongodb.core.convert.Document ) ; } if ( ObjectUtils . nullSafeEquals ( java.lang.Object , STRING ) ) { return org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonMultiLineStringConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonMultiLineStringConverter . org.springframework.data.mongodb.core.convert.GeoJsonMultiLineString ( org.springframework.data.mongodb.core.convert.Document ) ; } if ( ObjectUtils . nullSafeEquals ( java.lang.Object , STRING ) ) { return org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonPolygonConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonPolygonConverter . org.springframework.data.mongodb.core.convert.GeoJsonPolygon ( org.springframework.data.mongodb.core.convert.Document ) ; } if ( ObjectUtils . nullSafeEquals ( java.lang.Object , STRING ) ) { return org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonMultiPolygonConverter . org.springframework.data.mongodb.core.convert.GeoConverters.DocumentToGeoJsonMultiPolygonConverter . org.springframework.data.mongodb.core.convert.GeoJsonMultiPolygon ( org.springframework.data.mongodb.core.convert.Document ) ; } throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( STRING , java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> static java.util.List<java.lang.Double> < java.lang.Double > java.util.List<java.lang.Double> ( Point org.springframework.data.mongodb.core.convert.Point ) { return java.util.Arrays . java.util.List ( org.springframework.data.mongodb.core.convert.Point . getX ( ) , org.springframework.data.mongodb.core.convert.Point . getY ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) static java.util.List<org.springframework.data.mongodb.core.convert.Point> < Point > java.util.List<org.springframework.data.mongodb.core.convert.Point> ( java.util.List java.util.List ) { java.util.List<org.springframework.data.mongodb.core.convert.Point> < Point > java.util.List<org.springframework.data.mongodb.core.convert.Point> = new java.util.ArrayList<org.springframework.data.mongodb.core.convert.Point> < Point > ( ) ; for ( java.lang.Object java.lang.Object : java.util.List ) { Assert . isInstanceOf ( java.util.List .class , java.lang.Object ) ; java.util.List<java.lang.Number> < java.lang.Number > java.util.List<java.lang.Number> = ( java.util.List<java.lang.Number> < java.lang.Number > ) java.lang.Object ; java.util.List<org.springframework.data.mongodb.core.convert.Point> . add ( new GeoJsonPoint ( double ( java.util.List<java.lang.Number> . java.lang.Number ( NUMBER ) ) , double ( java.util.List<java.lang.Number> . java.lang.Number ( NUMBER ) ) ) ) ; } return java.util.List<org.springframework.data.mongodb.core.convert.Point> ; }  <METHOD_END>
<METHOD_START> static org.springframework.data.mongodb.core.convert.GeoJsonPolygon org.springframework.data.mongodb.core.convert.GeoJsonPolygon ( java.util.List java.util.List ) { return new GeoJsonPolygon ( java.util.List<org.springframework.data.mongodb.core.convert.Point> ( ( java.util.List ) java.util.List . java.lang.Object ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> private static double double ( java.lang.Object java.lang.Object ) { Assert . isInstanceOf ( java.lang.Number .class , java.lang.Object , STRING ) ; return NumberUtils . convertNumberToTargetClass ( ( java.lang.Number ) java.lang.Object , java.lang.Double .class ) . doubleValue ( ) ; }  <METHOD_END>
