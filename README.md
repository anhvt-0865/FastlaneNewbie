# FastlaneNewbie
Intergrate Fastlane into Android Project to distribute APK through Beta Fabric

# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```
xcode-select --install
```

Install _fastlane_ using
```
[sudo] gem install fastlane -NV
```
or alternatively using `brew cask install fastlane`

# Available Actions
## Android
### android beta
```
fastlane android beta
```
Deploy Beta Fabric
### android dev
```
fastlane android dev
```
Build APK debug
### android staging
```
fastlane android staging
```
Build APK staging
### android release
```
fastlane android release
```
Build APK release
### android screenshots
```
fastlane android screenshots
```
Build APK for screenshots

----