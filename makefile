all: BannerMaker.jar

bin/BannerMaker.class: src/*.java
	javac -source 1.6 -target 1.6 -d bin src/*.java

BannerMaker.jar: bin/BannerMaker.class
	cd bin
	jar cfe ../BannerMaker.jar BannerMaker *.class

clean:
	rm -rf bin/* BannerMaker.jar
