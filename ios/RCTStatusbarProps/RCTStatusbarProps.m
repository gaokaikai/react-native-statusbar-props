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

- (NSDictionary *)constantsToExport
{
    CGRect rectOfStatusbar = [[UIApplication sharedApplication] statusBarFrame];
    return @{ @"HEIGHT": [NSNumber numberWithDouble:rectOfStatusbar.size.height]};
}
@end
