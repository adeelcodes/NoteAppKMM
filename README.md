# Note apps using Kotlin Multiplatform Mobile

### Android

![Android app](screenshots/android.png?raw=true "kmm android app")

### iOS

![iOS app](screenshots/iOS.png?raw=true"KMM ios app")

## Built With

* Kotlin Multiplatform Mobile - with shared logic for data storage
* Jetpack compose - Android UI
* SwiftUI - UI for iOS
* SQLDelight - data storage and retrieval

## Getting Started

### Prerequisite
* Mac machine
* Brew
* Kdoctor
* Ruby 2.7
* Cocoapods
* Android Studio
* KMM plugin
* XCode

A detailed tutorial on the setup can be seen here as well: https://youtu.be/7Wl-G8aXxDA 
#### Installation

If Brew isn't installed then install it like this

##### Brew
```console
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```
##### Kdoctor
Kdoctor can be installed like this

```console
brew install kdoctor
```

##### Ruby 2.7

1. Install rbenv - Ruby version manager
2. Install Ruby 2.7
3. Mark 2.7 as global Ruby version
4. Verify
5. Close the terminal and open again - optional

```console
# 1
brew install rbenv
rbenv init

# 2
rbenv install 2.7

# 3
rbenv global 2.7

# 4

ruby -v
```
further instructions can be found here: https://antran.app/2021/m1_mac_part2/ 

NB: If you see that the Ruby version isn't 2.7 then you will probably have to enter env variables in bash/zsh manually like below
```console
nano ~/.zshrc
```
**paste the following** 
```console
export PATH="$HOME/.rbenv/bin:$PATH"
eval "$(rbenv init -)"
export PATH="/Users/[your_user_name]/.rbenv/shims:${PATH}"
```

##### Cocoapods

```console
sudo gem install cocoapods
```

##### Android Studio

https://developer.android.com/studio 

##### KMM plugin

After Android studio is installed, proceed to Preferences > Plugins > search for `kotlin multiplatform mobile` install and enable

##### Xcode

https://developer.apple.com/xcode/ 

After installing all the above if you type `kdoctor` in the terminal, you will see that all the dependencies are fulfilled.

#### Running the apps

Clone the project

**Android**

Open Android Studio > Open project > Press play on Android app

**iOS**

Open Xcode and open iosApp > `iosApp.xcodeproj` file. Press Build and it should run the app
