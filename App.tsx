import { StyleSheet,NativeModules,TurboModule, Text, View, TurboModuleRegistry } from 'react-native'
import React from 'react'


const { FileSystem } = NativeModules;

console.log(FileSystem)
const App = () => {
  console.log(Object.keys(NativeModules))
  return (
    <View>
      <Text>App</Text>
    </View>
  )
}

export default App

const styles = StyleSheet.create({})