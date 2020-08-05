# react-native-simple-aar

## Getting started

`$ npm install react-native-simple-aar --save`

### Mostly automatic installation

`$ react-native link react-native-simple-aar`

## Usage
```javascript
import SimpleAar from 'react-native-simple-aar';

// TODO: What to do with the module?
SimpleAar;
```

## How To Import .aar

1. Go Android Folder
2. Create new directory/folder and name it libs
3. Copy the aar to libs directory
4. On build.gradle> repositories add this
  ```gradle
  repositories {
    ...
    flatDir {
        dirs 'libs'
    }
  }
  ```
5. Still on build.gradle > dependencies add
  ```gradle
  dependencies {
    //noinspection GradleDynamicVersion
    implementation 'com.facebook.react:react-native:+'  // From node_modules

   implementation files ('libs/your_aar_name_inside_libs_folder.aar')
  }
  ```
  
