import React from 'react';
import {
    NativeModules
} from 'react-native';
const nodemodule = NativeModules.StatusbarProps;
const StatusbarProps = {
    getHeight:function(callback){
        nodemodule.getHeight(val=>callback(val))
    }
}
export default StatusbarProps;