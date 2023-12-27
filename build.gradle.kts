plugins {
	java
	id("org.springframework.boot") version "3.2.0"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()

}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("junit:junit:4.13.1")
	testImplementation("junit:junit:4.13.1")
	testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("com.h2database:h2")
	testImplementation("com.h2database:h2")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.mockito:mockito-core:3.+")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
