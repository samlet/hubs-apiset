stub:
	# mvn compile -f entity/pom.xml
	mvn install -DskipTests -f entity/pom.xml

mesh:
	mvn compile -f mesh/pom.xml

# mesh-proto:
#	protoc --plugin=protoc-gen-grpc-java=entity/target/protoc-plugins/protoc-gen-grpc-java-1.40.1-osx-x86_64.exe \
#		--grpc-java_out=mesh/src/main/java/ \
#		--proto_path=mesh/src/main/proto/ \
#		-Ientity/src/main/proto transitions.proto

# just inst fund
inst mod:
    mvn install -DskipTests -f {{mod}}/pom.xml

clean-types:
	rm entity/src/main/proto/types/*.proto

bundle-proto:
    just inst mods
    just inst facade

bi:
    just inst mods
    just inst facade

