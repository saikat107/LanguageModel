<METHOD_START> @ java.lang.Override protected org.springframework.util.xml.AbstractStaxXMLReader org.springframework.util.xml.AbstractStaxXMLReader ( java.io.InputStream java.io.InputStream ) throws javax.xml.stream.XMLStreamException { return new StaxEventXMLReader ( inputFactory . createXMLEventReader ( java.io.InputStream ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { javax.xml.stream.XMLInputFactory javax.xml.stream.XMLInputFactory = javax.xml.stream.XMLInputFactory . javax.xml.stream.XMLInputFactory ( ) ; javax.xml.stream.XMLEventReader javax.xml.stream.XMLEventReader = javax.xml.stream.XMLInputFactory . javax.xml.stream.XMLEventReader ( new java.io.StringReader ( java.lang.String ) ) ; javax.xml.stream.XMLEventReader . javax.xml.stream.events.XMLEvent ( ) ; StaxEventXMLReader org.springframework.util.xml.StaxEventXMLReader = new StaxEventXMLReader ( javax.xml.stream.XMLEventReader ) ; org.xml.sax.ContentHandler org.xml.sax.ContentHandler = mock ( org.xml.sax.ContentHandler .class ) ; org.springframework.util.xml.StaxEventXMLReader . setContentHandler ( org.xml.sax.ContentHandler ) ; org.springframework.util.xml.StaxEventXMLReader . parse ( new org.xml.sax.InputSource ( ) ) ; verify ( org.xml.sax.ContentHandler ) . startDocument ( ) ; verify ( org.xml.sax.ContentHandler ) . startElement ( eq ( STRING ) , eq ( STRING ) , eq ( STRING ) , any ( org.xml.sax.Attributes .class ) ) ; verify ( org.xml.sax.ContentHandler ) . endElement ( STRING , STRING , STRING ) ; verify ( org.xml.sax.ContentHandler ) . endDocument ( ) ; }  <METHOD_END>