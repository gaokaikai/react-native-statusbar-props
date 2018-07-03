import React from 'react';
import {
    NativeModules
} from 'react-native';
const nodemodule = NativeModules.StatusbarProps;
const StatusbarProps = {
    height:nodemodule.HEIGHT
}
export default StatusbarProps;