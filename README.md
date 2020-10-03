# oereb-client-gwt

## TODO
- ~~Hintergrundkarte Schweiz... ?!~~
- ~~cadastre-web-service entfernen (xsd, ...)~~
- ~~Unterschiedliches Icon für Suchresultate (siehe wgc-gwt)~~
- ~~Error handling~~ needs testing
- ~~Settings auslagern~~ Ganz konsequent wäre alles via Spring Boot Properties, diese als JSON exponieren und vom Browser konsumieren. Und nich einzelne Variablen und/oder RPC...
- ~~JSON-Antwort in POJO?~~ won't fix
- Eigene elemento-Elemente?
- ~~oereb web service URL als Konfig~~
- console.log() bereinigen
- Fehlende GUI-Übersetzungen
- Multilingual im Backend?
- ~~Ellipsis in Legende~~

## Development

First Terminal:
```
mvn clean spring-boot:run
```

Second Terminal:
```
mvn clean gwt:generate-module gwt:codeserver
```

Or simple devmode (which worked better for java.xml.bind on client side):
```
mvn gwt:generate-module gwt:devmode 
```

## Requests

- https://map.geo.tg.ch/services/oereb/extract/reduced/xml/geometry/CH998077412934
- https://oereb.gis-daten.ch/oereb/extract/reduced/xml/geometry/CH413645047763
- https://prozessor-oereb.ur.ch/oereb/extract/reduced/xml/geometry/CH474678750731