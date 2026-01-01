![scala-version][scala-version-badge]
[![Scala CI][ci-badge]][ci-link]
[![License][license-badge]](LICENSE)
[![Release Version][sonatype-releases-badge]][sonatype-releases-link]
[![Snapshot Version][sonatype-snapshots-badge]][sonatype-snapshots-link]

# scountries

Scala library that provides an enumeration of [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166) codes for countries, along with their subdivisions.

To use this library, add the following to your `build.sbt` file:

```scala
libraryDependencies += "io.lambdaworks" %% "scountries" % "x.y.z"
```

Where `x.y.z` refers to the release version in the badge above.

[scala-version-badge]: https://img.shields.io/badge/scala-2.13.16-blue?logo=scala&color=red
[ci-badge]: https://github.com/lambdaworks/scountries/actions/workflows/ci.yml/badge.svg
[ci-link]: https://github.com/lambdaworks/scountriesr/actions/workflows/ci.yml
[license-badge]: https://img.shields.io/badge/License-Apache%202.0-blue.svg
[sonatype-releases-badge]: https://img.shields.io/maven-central/v/io.lambdaworks/scountries_2.13.svg?label=Release "Maven Central"
[sonatype-releases-link]: https://central.sonatype.com/artifact/io.lambdaworks/scountries_2.13 "Maven Central"
[sonatype-snapshots-badge]: https://img.shields.io/maven-metadata/v?label=Snapshot&metadataUrl=https%3A%2F%2Fcentral.sonatype.com%2Frepository%2Fmaven-snapshots%2Fio%2Flambdaworks%2Fscountries_2.13%2Fmaven-metadata.xml "Sonatype Snapshots"
[sonatype-snapshots-link]: https://central.sonatype.com/repository/maven-snapshots/io/lambdaworks/scountries_2.13/ "Sonatype Snapshots"
