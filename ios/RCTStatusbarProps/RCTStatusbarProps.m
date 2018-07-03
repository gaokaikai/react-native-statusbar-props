//
//  RCTStatusbarProps.m
//  RCTStatusbarProps
//
//  Created by bhsj_imac on 2018/7/2.
//  Copyright © 2018年 Facebook. All rights reserved.
//

#import "RCTStatusbarProps.h"
#import <UIKit/UIKit.h>
@implementation RCTStatusbarProps
RCT_EXPORT_MODULE();
RCT_EXPORT_METHOD(getHeight:(RCTResponseSenderBlock)callback) {
    
    CGRect rectOfStatusbar = [[UIApplication sharedApplication] statusBarFrame];
    callback([NSArray arrayWithObject:[NSNumber numberWithDouble:rectOfStatusbar.size.height]]);
    
}
@end
