/*
 * Copyright 2016 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.clouddriver.aws.deploy.handlers;

import com.netflix.spinnaker.config.AwsConfiguration;
import com.netflix.spinnaker.clouddriver.aws.security.AmazonClientProvider;
import com.netflix.spinnaker.clouddriver.aws.services.RegionScopedProviderFactory;

public class DefaultMigrateClusterConfigurationStrategy extends MigrateClusterConfigurationStrategy {

  private AmazonClientProvider amazonClientProvider;
  private RegionScopedProviderFactory regionScopedProviderFactory;
  private AwsConfiguration.DeployDefaults deployDefaults;

  public DefaultMigrateClusterConfigurationStrategy(AmazonClientProvider amazonClientProvider,
                                                    RegionScopedProviderFactory regionScopedProviderFactory,
                                                    AwsConfiguration.DeployDefaults deployDefaults) {
    this.amazonClientProvider = amazonClientProvider;
    this.regionScopedProviderFactory = regionScopedProviderFactory;
    this.deployDefaults = deployDefaults;
  }

  @Override
  public AmazonClientProvider getAmazonClientProvider() {
    return amazonClientProvider;
  }

  @Override
  public RegionScopedProviderFactory getRegionScopedProviderFactory() {
    return regionScopedProviderFactory;
  }

  @Override
  public AwsConfiguration.DeployDefaults getDeployDefaults() {
    return deployDefaults;
  }

}
