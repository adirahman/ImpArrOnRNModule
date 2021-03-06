/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  Button,
  StatusBar,
} from 'react-native';

import {
  Header,
  LearnMoreLinks,
  Colors,
  DebugInstructions,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';

import SimpleAarModule from './ImpSimpleAar'

const App: () => React$Node = () => {
  return (
    <>
      <Header />
      <View>
        <Button
          onPress={() => {
            SimpleAarModule.callAarActivity();
          }}
          title="Go Activity inside AAR"
        />
      </View>
    </>
  );
};

export default App;
