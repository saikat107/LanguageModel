<METHOD_START> @ Test public void void ( ) java.lang.Exception { Site org.springframework.data.jpa.repository.Site = org.springframework.data.jpa.repository.SiteRepository . save ( new Site ( ) ) ; Item org.springframework.data.jpa.repository.Item = org.springframework.data.jpa.repository.ItemRepository . save ( new Item ( NUMBER , NUMBER ) ) ; org.springframework.data.jpa.repository.ItemSiteRepository . save ( new ItemSite ( org.springframework.data.jpa.repository.Item , org.springframework.data.jpa.repository.Site ) ) ; java.util.Optional<org.springframework.data.jpa.repository.ItemSite> < ItemSite > java.util.Optional<org.springframework.data.jpa.repository.ItemSite> = org.springframework.data.jpa.repository.ItemSiteRepository . findOne ( new ItemSiteId ( new ItemId ( org.springframework.data.jpa.repository.Item . getId ( ) , org.springframework.data.jpa.repository.Item . getManufacturerId ( ) ) , org.springframework.data.jpa.repository.Site . getId ( ) ) ) ; assertThat ( java.util.Optional<org.springframework.data.jpa.repository.ItemSite> , is ( notNullValue ( ) ) ) ; assertThat ( java.util.Optional<org.springframework.data.jpa.repository.ItemSite> . isPresent ( ) , is ( true ) ) ; }  <METHOD_END>
